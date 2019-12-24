package cn.edu.aynu.rjxy.management.service.impl;

import cn.edu.aynu.rjxy.management.service.TimetableService;
import cn.edu.aynu.rjxy.mapper.TbTimetableMapper;
import cn.edu.aynu.rjxy.pojo.TbTimetable;
import cn.edu.aynu.rjxy.pojo.TbTimetableExample;
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
public class TimetableServiceImpl implements TimetableService {

	@Autowired
	private TbTimetableMapper timetableMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbTimetable> findAll() {
		return timetableMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbTimetable> list=    timetableMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbTimetable timetable) {
		timetableMapper.insert(timetable);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbTimetable timetable){
		timetableMapper.updateByPrimaryKey(timetable);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbTimetable findOne(Long id){
		return timetableMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			timetableMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbTimetable timetable, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbTimetableExample example=new TbTimetableExample();
		TbTimetableExample.Criteria criteria = example.createCriteria();
		
		if(timetable!=null){			
						if(timetable.getSpare()!=null && timetable.getSpare().length()>0){
				criteria.andSpareLike("%"+timetable.getSpare()+"%");
			}	
		}
		
		List<TbTimetable> list= timetableMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
