package cn.edu.aynu.rjxy.management.controller;


import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.management.service.CinemaService;
import cn.edu.aynu.rjxy.pojo.TbCinema;
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
@RequestMapping("/cinema")
public class CinemaController {

	@Reference
	private CinemaService cinemaService;
	
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
	
}
