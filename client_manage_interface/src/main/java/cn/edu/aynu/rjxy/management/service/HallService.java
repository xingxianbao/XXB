package cn.edu.aynu.rjxy.management.service;


import cn.edu.aynu.rjxy.pojo.TbHall;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface HallService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbHall> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbHall hall);


	/**
	 * 修改
	 */
	public void update(TbHall hall);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbHall findOne(Long hallId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] hallIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbHall hall, int pageNum, int pageSize);
	
}
