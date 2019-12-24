package cn.edu.aynu.rjxy.management.service.impl;

import cn.edu.aynu.rjxy.management.service.SellersService;
import cn.edu.aynu.rjxy.mapper.TbSellersMapper;
import cn.edu.aynu.rjxy.pojo.TbSellers;
import cn.edu.aynu.rjxy.pojo.TbSellersExample;
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
public class SellersServiceImpl implements SellersService {

	@Autowired
	private TbSellersMapper sellersMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSellers> findAll() {
		return sellersMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbSellers> list=    sellersMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSellers sellers) {
		sellersMapper.insert(sellers);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSellers sellers){
		sellersMapper.updateByPrimaryKey(sellers);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbSellers findOne(String username){
		return sellersMapper.selectByPrimaryKey(username);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] usernames) {
		for(String username:usernames){
			sellersMapper.deleteByPrimaryKey(username);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbSellers sellers, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSellersExample example=new TbSellersExample();
		TbSellersExample.Criteria criteria = example.createCriteria();
		
		if(sellers!=null){			
						if(sellers.getPassword()!=null && sellers.getPassword().length()>0){
				criteria.andPasswordLike("%"+sellers.getPassword()+"%");
			}			if(sellers.getSpare()!=null && sellers.getSpare().length()>0){
				criteria.andSpareLike("%"+sellers.getSpare()+"%");
			}	
		}
		
		List<TbSellers> list= sellersMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
