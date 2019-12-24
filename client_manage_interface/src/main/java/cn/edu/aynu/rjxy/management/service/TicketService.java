package cn.edu.aynu.rjxy.management.service;


import cn.edu.aynu.rjxy.pojo.TbTicket;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface TicketService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbTicket> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbTicket ticket);


	/**
	 * 修改
	 */
	public void update(TbTicket ticket);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbTicket findOne(Long ticketId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ticketIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbTicket ticket, int pageNum, int pageSize);
	
}
