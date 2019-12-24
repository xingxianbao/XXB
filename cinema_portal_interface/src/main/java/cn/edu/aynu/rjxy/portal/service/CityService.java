package cn.edu.aynu.rjxy.portal.service;


import cn.edu.aynu.rjxy.pojo.TbCity;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CityService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCity> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbCity city);


	/**
	 * 修改
	 */
	public void update(TbCity city);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCity findOne(Long cityId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] cityIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbCity city, int pageNum, int pageSize);
	
}
