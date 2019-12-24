package cn.edu.aynu.rjxy.management.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import cn.edu.aynu.rjxy.management.service.ClientService;
import cn.edu.aynu.rjxy.mapper.TbClientMapper;
import cn.edu.aynu.rjxy.pojo.TbClient;
import cn.edu.aynu.rjxy.pojo.TbClientExample;
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
public class ClientServiceImpl implements ClientService {

	@Autowired
	private TbClientMapper clientMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbClient> findAll() {
		return clientMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbClient> list=    clientMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbClient client) {
		clientMapper.insert(client);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbClient client){
		clientMapper.updateByPrimaryKey(client);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbClient findOne(Long clientId){
		return clientMapper.selectByPrimaryKey(clientId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] clientIds) {
		for(Long clientId:clientIds){
			clientMapper.deleteByPrimaryKey(clientId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbClient client, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbClientExample example=new TbClientExample();
		TbClientExample.Criteria criteria = example.createCriteria();
		
		if(client!=null){			
						if(client.getPassword()!=null && client.getPassword().length()>0){
				criteria.andPasswordLike("%"+client.getPassword()+"%");
			}			if(client.getPayPwd()!=null && client.getPayPwd().length()>0){
				criteria.andPayPwdLike("%"+client.getPayPwd()+"%");
			}			if(client.getPhone()!=null && client.getPhone().length()>0){
				criteria.andPhoneLike("%"+client.getPhone()+"%");
			}			if(client.getEmail()!=null && client.getEmail().length()>0){
				criteria.andEmailLike("%"+client.getEmail()+"%");
			}			if(client.getSpare()!=null && client.getSpare().length()>0){
				criteria.andSpareLike("%"+client.getSpare()+"%");
			}	
		}
		
		List<TbClient> list= clientMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
