package cn.edu.aynu.rjxy.portal.service.impl;
import cn.edu.aynu.rjxy.mapper.TbTypeMapper;
import cn.edu.aynu.rjxy.pojo.TbCity;
import cn.edu.aynu.rjxy.pojo.TbType;
import cn.edu.aynu.rjxy.pojo.TbTypeExample;
import cn.edu.aynu.rjxy.portal.service.TypeService;
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
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TbTypeMapper typeMapper;

	@Autowired
	private RedisTemplate redisTemplate;
	/**
	 * 查询全部
	 */
	@Override
	public List<TbType> findAll() {
		List<TbType> typeList = (List<TbType>)
				redisTemplate.boundHashOps("cityAndTypeList").get("typeList");
		if (null==typeList){
			typeList = typeMapper.selectByExample(null);
			redisTemplate.boundHashOps("cityAndTypeList").put("typeList",typeList);
			System.out.println("typeList from cityList");
		}
		return typeList;
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbType> list=    typeMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbType type) {
		typeMapper.insert(type);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbType type){
		typeMapper.updateByPrimaryKey(type);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbType findOne(Long typeId){
		return typeMapper.selectByPrimaryKey(typeId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] typeIds) {
		for(Long typeId:typeIds){
			typeMapper.deleteByPrimaryKey(typeId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbType type, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbTypeExample example=new TbTypeExample();
		TbTypeExample.Criteria criteria = example.createCriteria();
		
		if(type!=null){			
						if(type.getTypeName()!=null && type.getTypeName().length()>0){
				criteria.andTypeNameLike("%"+type.getTypeName()+"%");
			}			if(type.getSpare()!=null && type.getSpare().length()>0){
				criteria.andSpareLike("%"+type.getSpare()+"%");
			}	
		}
		
		List<TbType> list= typeMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
