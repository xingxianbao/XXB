package cn.edu.aynu.rjxy.management.controller;

import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.management.service.HomeDataService;
import cn.edu.aynu.rjxy.pojo.TbHomeData;
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
@RequestMapping("/homeData")
public class HomeDataController {

	@Reference
	private HomeDataService homeDataService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbHomeData> findAll(){
		return homeDataService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return homeDataService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param homeData
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbHomeData homeData){
		try {
			homeDataService.add(homeData);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param homeData
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbHomeData homeData){
		try {
			homeDataService.update(homeData);
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
	public TbHomeData findOne(Long id){
		return homeDataService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			homeDataService.delete(ids);
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
	public PageInfo search(@RequestBody TbHomeData homeData, int pageNum, int pageSize  ){
		return homeDataService.findPage(homeData, pageNum, pageSize);
	}
	
}
