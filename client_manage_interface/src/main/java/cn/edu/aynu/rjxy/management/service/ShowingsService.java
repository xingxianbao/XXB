package cn.edu.aynu.rjxy.management.service;


import cn.edu.aynu.rjxy.pojo.TbShowings;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ShowingsService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbShowings> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(String username,TbShowings showings);


	/**
	 * 修改
	 */
	public void update(TbShowings showings);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbShowings findOne(Long showId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] showIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbShowings showings, int pageNum, int pageSize);


}
