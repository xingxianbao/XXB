package cn.edu.aynu.rjxy.management.controller;

import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.management.service.CommentService;
import cn.edu.aynu.rjxy.pojo.TbComment;
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
@RequestMapping("/comment")
public class CommentController {

	@Reference
	private CommentService commentService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbComment> findAll(){
		return commentService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return commentService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param comment
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbComment comment){
		try {
			commentService.add(comment);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param comment
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbComment comment){
		try {
			commentService.update(comment);
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
	public TbComment findOne(Long id){
		return commentService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			commentService.delete(ids);
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
	public PageInfo search(@RequestBody TbComment comment, int pageNum, int pageSize  ){
		return commentService.findPage(comment, pageNum, pageSize);
	}
	
}
