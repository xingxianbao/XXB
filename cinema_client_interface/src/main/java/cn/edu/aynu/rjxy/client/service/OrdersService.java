package cn.edu.aynu.rjxy.client.service;


import cn.edu.aynu.rjxy.pojo.TbOrders;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface OrdersService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbOrders> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbOrders orders);


	/**
	 * 修改
	 */
	public void update(TbOrders orders);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbOrders findOne(String orderId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(String[] orderIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbOrders orders, int pageNum, int pageSize);
	
}
