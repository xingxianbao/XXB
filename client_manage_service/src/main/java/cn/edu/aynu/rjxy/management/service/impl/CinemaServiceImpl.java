package cn.edu.aynu.rjxy.management.service.impl;


import cn.edu.aynu.rjxy.management.service.CinemaService;
import cn.edu.aynu.rjxy.mapper.TbCinemaMapper;
import cn.edu.aynu.rjxy.pojo.TbCinema;
import cn.edu.aynu.rjxy.pojo.TbCinemaExample;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
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
public class CinemaServiceImpl implements CinemaService {

	@Autowired
	private TbCinemaMapper cinemaMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCinema> findAll() {
		return cinemaMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbCinema> list=    cinemaMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCinema cinema) {
		cinema.setIsUsable(0L);

		cinemaMapper.insert(cinema);
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCinema cinema){
		cinemaMapper.updateByPrimaryKey(cinema);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbCinema findOne(Long cinemaId){
		return cinemaMapper.selectByPrimaryKey(cinemaId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] cinemaIds) {
		for(Long cinemaId:cinemaIds){
			cinemaMapper.deleteByPrimaryKey(cinemaId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbCinema cinema, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCinemaExample example=new TbCinemaExample();

		if(cinema!=null){
			TbCinemaExample.Criteria criteria = example.createCriteria();
			if(cinema.getCityId()!=null&&(cinema.getCityId()+"").length()>0){
				criteria.andCityIdEqualTo(cinema.getCityId());
			}
			if(cinema.getIsUsable()!=null&&(cinema.getIsUsable()+"").length()>0){
				criteria.andIsUsableEqualTo(cinema.getIsUsable());
			}
		}
		
		List<TbCinema> list= cinemaMapper.selectByExample(example);
		return new PageInfo(list);
	}

	@Override
	public void updateIsUsable(Long cinemaId, Long isUsable) {
		TbCinema cinema = cinemaMapper.selectByPrimaryKey(cinemaId);
		cinema.setIsUsable(isUsable);
		int i = cinemaMapper.updateByPrimaryKeySelective(cinema);
		if(i<=0){
			int a = 2/0;
		}
	}

}
