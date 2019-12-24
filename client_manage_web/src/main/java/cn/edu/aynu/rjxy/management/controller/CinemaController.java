package cn.edu.aynu.rjxy.management.controller;


import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.management.service.CinemaService;
import cn.edu.aynu.rjxy.management.service.SellersService;
import cn.edu.aynu.rjxy.pojo.TbCinema;
import cn.edu.aynu.rjxy.pojo.TbSellers;
import cn.edu.aynu.rjxy.utils.RadomStr;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.*;
import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/cinema")
public class CinemaController {



	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Destination email_notice_queue;

	@Reference
	private CinemaService cinemaService;

	@Reference
	private SellersService sellersService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCinema> findAll(){
		return cinemaService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return cinemaService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param cinema
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCinema cinema){
		try {
			cinemaService.add(cinema);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}

	/**
	 * 修改
	 * @param cinema
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCinema cinema){
		try {
			cinemaService.update(cinema);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbCinema findOne(Long id){
		return cinemaService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			cinemaService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/search")
	public PageInfo search(@RequestBody TbCinema cinema, int pageNum, int pageSize  ){
		return cinemaService.findPage(cinema, pageNum, pageSize);
	}

	@RequestMapping("updateIsUsable")
	public Result updateIsUsable(Long cinemaId,Long isUsable){

		try {
			cinemaService.updateIsUsable(cinemaId,isUsable);
			if ((isUsable+"").equals("1")||(isUsable+"").equals("2")){
				TbCinema cinema = cinemaService.findOne(cinemaId);
				TbSellers seller = new TbSellers();
				if((isUsable+"").equals("1")){
					String pw = RadomStr.getSixChar();
					seller.setUsername(cinemaId+"_"+ RadomStr.getSixStr());
					seller.setPassword(pw);
					seller.setCinemaId(cinemaId);
					//使用加密工具类对密码做加密
					BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
					seller.setPassword(encoder.encode(seller.getPassword()));
					sellersService.add(seller);
					seller.setPassword(pw);
				}
				jmsTemplate.send(email_notice_queue, new MessageCreator() {
					@Override
					public Message createMessage(Session session) throws JMSException {
						MapMessage mapMessage =session.createMapMessage();
						mapMessage.setString("cinema",JSON.toJSONString(cinema));
						mapMessage.setString("seller",JSON.toJSONString(seller));
						return mapMessage;
					}
				});
			}
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	
}
