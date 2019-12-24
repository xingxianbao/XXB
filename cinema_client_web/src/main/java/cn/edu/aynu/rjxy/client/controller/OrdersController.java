package cn.edu.aynu.rjxy.client.controller;

import cn.edu.aynu.rjxy.client.service.OrdersService;
import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.pojo.TbOrders;
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
@RequestMapping("/orders")
public class OrdersController {

	@Reference
	private OrdersService ordersService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbOrders> findAll(){
		return ordersService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return ordersService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param orders
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbOrders orders){
		try {
			ordersService.add(orders);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param orders
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbOrders orders){
		try {
			ordersService.update(orders);
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
	public TbOrders findOne(String orderId){
		return ordersService.findOne(orderId);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(String [] ids){
		try {
			ordersService.delete(ids);
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
	public PageInfo search(@RequestBody TbOrders orders, int pageNum, int pageSize  ){
		return ordersService.findPage(orders, pageNum, pageSize);
	}
	
}
