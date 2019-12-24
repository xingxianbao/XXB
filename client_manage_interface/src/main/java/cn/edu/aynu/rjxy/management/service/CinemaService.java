package cn.edu.aynu.rjxy.management.service;

import cn.edu.aynu.rjxy.pojo.TbCinema;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CinemaService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCinema> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageInfo findPage(int pageNum, int pageSize);


	/**
	 * 增加
	*/
	public void add(TbCinema cinema);


	/**
	 * 修改
	 */
	public void update(TbCinema cinema);


	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCinema findOne(Long cinemaId);


	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] cinemaIds);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageInfo findPage(TbCinema cinema, int pageNum, int pageSize);

	void updateIsUsable(Long cinemaId, Long isUsable);
}
