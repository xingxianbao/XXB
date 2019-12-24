package cn.edu.aynu.rjxy.management.service;


import cn.edu.aynu.rjxy.pojo.TbHomeData;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface HomeDataService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbHomeData> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbHomeData home_data);


	/**
	 * 修改
	 */
	public void update(TbHomeData home_data);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbHomeData findOne(Long homeId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] homeIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbHomeData home_data, int pageNum, int pageSize);
	
}
