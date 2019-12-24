package cn.edu.aynu.rjxy.management.service.impl;

import cn.edu.aynu.rjxy.management.service.TicketService;
import cn.edu.aynu.rjxy.mapper.TbTicketMapper;
import cn.edu.aynu.rjxy.pojo.TbTicket;
import cn.edu.aynu.rjxy.pojo.TbTicketExample;
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
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TbTicketMapper ticketMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbTicket> findAll() {
		return ticketMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbTicket> list=    ticketMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbTicket ticket) {
		ticketMapper.insert(ticket);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbTicket ticket){
		ticketMapper.updateByPrimaryKey(ticket);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbTicket findOne(Long ticketId){
		return ticketMapper.selectByPrimaryKey(ticketId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ticketIds) {
		for(Long ticketId:ticketIds){
			ticketMapper.deleteByPrimaryKey(ticketId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbTicket ticket, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbTicketExample example=new TbTicketExample();
		TbTicketExample.Criteria criteria = example.createCriteria();
		
		if(ticket!=null){			

		}
		
		List<TbTicket> list= ticketMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
