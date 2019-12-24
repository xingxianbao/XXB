package cn.edu.aynu.rjxy.management.controller;

import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.management.service.HallService;
import cn.edu.aynu.rjxy.management.service.SellersService;
import cn.edu.aynu.rjxy.pojo.TbHall;
import cn.edu.aynu.rjxy.pojo.TbSellers;
import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import org.springframework.security.core.context.SecurityContextHolder;
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
@RequestMapping("/hall")
public class HallController {

	@Reference
	private SellersService sellersService;

	@Reference
	private HallService hallService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbHall> findAll(){
		return hallService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return hallService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param hall
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbHall hall){
		try {String username = SecurityContextHolder.getContext().getAuthentication().getName();
			TbSellers seller = sellersService.findOne(username);
			hall.setCinemaId(seller.getCinemaId());
			hallService.add(hall);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param hall
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbHall hall){
		try {
			hallService.update(hall);
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
	public TbHall findOne(Long id){
		return hallService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			hallService.delete(ids);
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
	public PageInfo search(@RequestBody TbHall hall, int pageNum, int pageSize  ){

		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		TbSellers seller = sellersService.findOne(username);
		hall.setCinemaId(seller.getCinemaId());
		return hallService.findPage(hall, pageNum, pageSize);
	}
	
}
