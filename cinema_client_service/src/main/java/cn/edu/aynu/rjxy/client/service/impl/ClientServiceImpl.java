package cn.edu.aynu.rjxy.client.service.impl;

import cn.edu.aynu.rjxy.client.service.ClientService;
import cn.edu.aynu.rjxy.mapper.TbClientMapper;
import cn.edu.aynu.rjxy.pojo.TbClient;
import cn.edu.aynu.rjxy.pojo.TbClientExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private TbClientMapper clientMapper;

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Destination email_code_queue;
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

	@Override
	public boolean sendCode(String email) {
		String code = String.valueOf(new Random().nextInt(899999) + 100000);

		jmsTemplate.send(email_code_queue, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				MapMessage mapMessage =session.createMapMessage();
				mapMessage.setString("email",email);
				mapMessage.setString("emailCode",code);
				return mapMessage;
			}
		});
		redisTemplate.boundValueOps(email).set(code,2, TimeUnit.MINUTES);

		return false;
	}

}
