package cn.edu.aynu.rjxy.client.service;


import cn.edu.aynu.rjxy.pojo.TbClient;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ClientService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbClient> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbClient client);


	/**
	 * 修改
	 */
	public void update(TbClient client);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbClient findOne(Long clientId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] clientIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbClient client, int pageNum, int pageSize);

    boolean  sendCode(String email);
}
