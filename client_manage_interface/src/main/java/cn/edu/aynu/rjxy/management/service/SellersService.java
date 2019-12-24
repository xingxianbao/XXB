package cn.edu.aynu.rjxy.management.service;


import cn.edu.aynu.rjxy.pojo.TbSellers;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SellersService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbSellers> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbSellers sellers);


	/**
	 * 修改
	 */
	public void update(TbSellers sellers);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbSellers findOne(String username);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(String[] usernames);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbSellers sellers, int pageNum, int pageSize);
	
}
