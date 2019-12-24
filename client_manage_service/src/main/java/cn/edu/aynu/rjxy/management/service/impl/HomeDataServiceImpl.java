package cn.edu.aynu.rjxy.management.service.impl;
import cn.edu.aynu.rjxy.management.service.HomeDataService;
import cn.edu.aynu.rjxy.mapper.TbHomeDataMapper;
import cn.edu.aynu.rjxy.pojo.TbHomeData;
import cn.edu.aynu.rjxy.pojo.TbHomeDataExample;
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
public class HomeDataServiceImpl implements HomeDataService {

	@Autowired
	private TbHomeDataMapper homeDataMapper;
	
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
	 * @param id
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
						if(homeData.getMovPic1()!=null && homeData.getMovPic1().length()>0){
				criteria.andMovPic1Like("%"+homeData.getMovPic1()+"%");
			}			if(homeData.getMovName()!=null && homeData.getMovName().length()>0){
				criteria.andMovNameLike("%"+homeData.getMovName()+"%");
			}			if(homeData.getSpare()!=null && homeData.getSpare().length()>0){
				criteria.andSpareLike("%"+homeData.getSpare()+"%");
			}	
		}
		
		List<TbHomeData> list= homeDataMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
