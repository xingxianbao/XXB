package cn.edu.aynu.rjxy.client.service.impl;

import cn.edu.aynu.rjxy.client.service.OrdersService;
import cn.edu.aynu.rjxy.mapper.TbOrdersMapper;
import cn.edu.aynu.rjxy.pojo.TbOrders;
import cn.edu.aynu.rjxy.pojo.TbOrdersExample;
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
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private TbOrdersMapper ordersMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbOrders> findAll() {
		return ordersMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbOrders> list=    ordersMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbOrders orders) {
		ordersMapper.insert(orders);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbOrders orders){
		ordersMapper.updateByPrimaryKey(orders);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbOrders findOne(String orderId){
		return ordersMapper.selectByPrimaryKey(orderId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] orderIds) {
		for(String orderId:orderIds){
			ordersMapper.deleteByPrimaryKey(orderId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbOrders orders, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbOrdersExample example=new TbOrdersExample();
		TbOrdersExample.Criteria criteria = example.createCriteria();
		
		if(orders!=null){			
						if(orders.getCinemaId()!=null && orders.getCinemaId().length()>0){
				criteria.andCinemaIdLike("%"+orders.getCinemaId()+"%");
			}			if(orders.getSpare()!=null && orders.getSpare().length()>0){
				criteria.andSpareLike("%"+orders.getSpare()+"%");
			}	
		}
		
		List<TbOrders> list= ordersMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
