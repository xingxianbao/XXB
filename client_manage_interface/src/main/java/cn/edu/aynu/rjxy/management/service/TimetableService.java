package cn.edu.aynu.rjxy.management.service;


import cn.edu.aynu.rjxy.pojo.TbTimetable;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface TimetableService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbTimetable> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbTimetable timetable);


	/**
	 * 修改
	 */
	public void update(TbTimetable timetable);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbTimetable findOne(Long id);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbTimetable timetable, int pageNum, int pageSize);
	
}
