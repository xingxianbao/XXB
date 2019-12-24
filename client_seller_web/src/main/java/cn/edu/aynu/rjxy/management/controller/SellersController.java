package cn.edu.aynu.rjxy.management.controller;

import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.management.service.SellersService;
import cn.edu.aynu.rjxy.pojo.TbSellers;
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
@RequestMapping("/sellers")
public class SellersController {

	@Reference
	private SellersService sellersService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSellers> findAll(){
		return sellersService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return sellersService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param sellers
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbSellers sellers){
		try {
			sellersService.add(sellers);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param sellers
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSellers sellers){
		try {
			sellersService.update(sellers);
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
	public TbSellers findOne(String username){
		return sellersService.findOne(username);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(String [] usernames){
		try {
			sellersService.delete(usernames);
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
	public PageInfo search(@RequestBody TbSellers sellers, int pageNum, int pageSize  ){
		return sellersService.findPage(sellers, pageNum, pageSize);
	}
	
}
