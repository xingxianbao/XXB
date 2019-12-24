package cn.edu.aynu.rjxy.management.service.impl;

import cn.edu.aynu.rjxy.management.service.HallService;
import cn.edu.aynu.rjxy.mapper.TbHallMapper;
import cn.edu.aynu.rjxy.pojo.TbHall;
import cn.edu.aynu.rjxy.pojo.TbHallExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class HallServiceImpl implements HallService {

	@Autowired
	private TbHallMapper hallMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbHall> findAll() {
		return hallMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbHall> list=    hallMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbHall hall) {
		hallMapper.insert(hall);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbHall hall){
		hallMapper.updateByPrimaryKey(hall);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbHall findOne(Long hallId){
		return hallMapper.selectByPrimaryKey(hallId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] hallIds) {
		for(Long hallId:hallIds){
			hallMapper.deleteByPrimaryKey(hallId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbHall hall, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbHallExample example=new TbHallExample();
		TbHallExample.Criteria criteria = example.createCriteria();
		
		if(hall!=null){
			if (null!=hall.getCinemaId()&&(hall.getCinemaId()+"").length()>0){
				criteria.andCinemaIdEqualTo(hall.getCinemaId());
			}
		}
		
		List<TbHall> list= hallMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
