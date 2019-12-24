package cn.edu.aynu.rjxy.management.service;


import cn.edu.aynu.rjxy.pojo.TbComment;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CommentService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbComment> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbComment comment);


	/**
	 * 修改
	 */
	public void update(TbComment comment);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbComment findOne(Long comId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] comIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbComment comment, int pageNum, int pageSize);
	
}
