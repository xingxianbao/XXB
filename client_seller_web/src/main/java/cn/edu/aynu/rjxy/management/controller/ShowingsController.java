package cn.edu.aynu.rjxy.management.controller;

import java.util.Date;
import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.management.service.ShowingsService;
import cn.edu.aynu.rjxy.pojo.TbShowings;
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
@RequestMapping("/showings")
public class ShowingsController {

	@Reference
	private ShowingsService showingsService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbShowings> findAll(){
		return showingsService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return showingsService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param showings
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbShowings showings){
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			showingsService.add(username,showings);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "添加放映时间冲突,请填写正确的时间");
		}
	}
	
	/**
	 * 修改
	 * @param showings
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbShowings showings){
		try {
			showingsService.update(showings);
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
	public TbShowings findOne(Long id){
		return showingsService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			showingsService.delete(ids);
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
	public PageInfo search(@RequestBody TbShowings showings, int pageNum, int pageSize  ){
		System.out.println("ddd");
		return showingsService.findPage(showings, pageNum, pageSize);
	}
	
}
