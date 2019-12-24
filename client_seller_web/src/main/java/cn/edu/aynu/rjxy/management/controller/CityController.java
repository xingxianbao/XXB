package cn.edu.aynu.rjxy.management.controller;

import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.management.service.CityService;
import cn.edu.aynu.rjxy.pojo.TbCity;
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
@RequestMapping("/city")
public class CityController {

	@Reference
	private CityService cityService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCity> findAll(){
		return cityService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return cityService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param city
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCity city){
		try {
			cityService.add(city);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param city
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCity city){
		try {
			cityService.update(city);
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
	public TbCity findOne(Long id){
		return cityService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			cityService.delete(ids);
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
	public PageInfo search(@RequestBody TbCity city, int pageNum, int pageSize  ){
		return cityService.findPage(city, pageNum, pageSize);
	}
	
}
