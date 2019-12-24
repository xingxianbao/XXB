package cn.edu.aynu.rjxy.portal.service.impl;

import cn.edu.aynu.rjxy.mapper.TbCityMapper;
import cn.edu.aynu.rjxy.pojo.TbCity;
import cn.edu.aynu.rjxy.pojo.TbCityExample;
import cn.edu.aynu.rjxy.portal.service.CityService;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private TbCityMapper cityMapper;

	@Autowired
	private RedisTemplate redisTemplate;


	/**
	 * 查询全部
	 */
	@Override
	public List<TbCity> findAll() {
		List<TbCity> cityList = (List<TbCity>)
			redisTemplate.boundHashOps("cityAndTypeList").get("cityList");
		if (null==cityList){
			cityList = cityMapper.selectByExample(null);
			redisTemplate.boundHashOps("cityAndTypeList").put("cityList",cityList);
			System.out.println("cityList from cityList");
		}
		return cityList;
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbCity> list=    cityMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCity city) {
		cityMapper.insert(city);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCity city){
		cityMapper.updateByPrimaryKey(city);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbCity findOne(Long cityId){
		return cityMapper.selectByPrimaryKey(cityId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] cityIds) {
		for(Long cityId:cityIds){
			cityMapper.deleteByPrimaryKey(cityId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbCity city, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCityExample example=new TbCityExample();
		TbCityExample.Criteria criteria = example.createCriteria();
		
		if(city!=null){			
						if(city.getCityName()!=null && city.getCityName().length()>0){
				criteria.andCityNameLike("%"+city.getCityName()+"%");
			}			if(city.getSpare()!=null && city.getSpare().length()>0){
				criteria.andSpareLike("%"+city.getSpare()+"%");
			}	
		}
		
		List<TbCity> list= cityMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
