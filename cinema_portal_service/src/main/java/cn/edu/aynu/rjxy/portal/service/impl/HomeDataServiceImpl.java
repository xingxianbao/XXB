package cn.edu.aynu.rjxy.portal.service.impl;
import cn.edu.aynu.rjxy.mapper.TbHomeDataMapper;
import cn.edu.aynu.rjxy.pojo.TbHomeData;
import cn.edu.aynu.rjxy.pojo.TbHomeDataExample;
import cn.edu.aynu.rjxy.portal.service.HomeDataService;
import cn.edu.aynu.rjxy.utils.IdWorker;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */

@Service
public class HomeDataServiceImpl implements HomeDataService {

	@Autowired
	private TbHomeDataMapper homeDataMapper;

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private IdWorker idWorker;
	/**
	 * 查询全部
	 */
	@Override
	public List<TbHomeData> findAll() {
		return homeDataMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbHomeData> list=    homeDataMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbHomeData homeData) {
		homeDataMapper.insert(homeData);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbHomeData homeData){
		homeDataMapper.updateByPrimaryKey(homeData);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbHomeData findOne(Long homeId){
		return homeDataMapper.selectByPrimaryKey(homeId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] homeIds) {
		for(Long homeId:homeIds){
			homeDataMapper.deleteByPrimaryKey(homeId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbHomeData homeData, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		TbHomeDataExample example=new TbHomeDataExample();
		TbHomeDataExample.Criteria criteria = example.createCriteria();
		
		if(homeData!=null){			
					if(null!=homeData.getCityId()&&(homeData.getCityId()+"").length()>0){
						criteria.andCityIdEqualTo(homeData.getCityId());
					}
		}
		
		List<TbHomeData> list= homeDataMapper.selectByExample(example);
		return new PageInfo(list);
	}

	@Override
	public List<TbHomeData> findByCityId(Long cityId) {
		List<TbHomeData> homeDataList = (List<TbHomeData>)
				redisTemplate.boundHashOps("homeDataList").get(cityId);
		if (null==homeDataList){
			TbHomeDataExample example=new TbHomeDataExample();
			TbHomeDataExample.Criteria criteria = example.createCriteria();
			criteria.andCityIdEqualTo(cityId);
			homeDataList= homeDataMapper.selectByExample(example);
			redisTemplate.boundHashOps("homeDataList").put(cityId,homeDataList);
		}

		return homeDataList;
	}

}
