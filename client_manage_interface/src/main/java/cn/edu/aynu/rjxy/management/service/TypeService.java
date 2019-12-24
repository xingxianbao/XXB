package cn.edu.aynu.rjxy.management.service;


import cn.edu.aynu.rjxy.pojo.TbType;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface TypeService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbType> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbType type);


	/**
	 * 修改
	 */
	public void update(TbType type);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbType findOne(Long typeId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] typeIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbType type, int pageNum, int pageSize);
	
}
