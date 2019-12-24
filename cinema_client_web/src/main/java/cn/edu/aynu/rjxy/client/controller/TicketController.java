package cn.edu.aynu.rjxy.client.controller;

import cn.edu.aynu.rjxy.client.service.TicketService;
import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.pojo.TbTicket;
import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Reference
	private TicketService ticketService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbTicket> findAll(){
		return ticketService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return ticketService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param ticket
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbTicket ticket){
		try {
			ticketService.add(ticket);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param ticket
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbTicket ticket){
		try {
			ticketService.update(ticket);
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
	public TbTicket findOne(Long id){
		return ticketService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			ticketService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/search")
	public PageInfo search(@RequestBody TbTicket ticket, int pageNum, int pageSize  ){
		return ticketService.findPage(ticket, pageNum, pageSize);
	}
	
}
