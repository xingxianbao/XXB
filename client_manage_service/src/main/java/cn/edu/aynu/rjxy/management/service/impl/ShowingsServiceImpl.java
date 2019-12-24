package cn.edu.aynu.rjxy.management.service.impl;

import cn.edu.aynu.rjxy.management.service.ShowingsService;
import cn.edu.aynu.rjxy.mapper.*;
import cn.edu.aynu.rjxy.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ShowingsServiceImpl implements ShowingsService {

	@Autowired
	private TbShowingsMapper showingsMapper;

	@Autowired
	private TbSellersMapper sellersMapper;

	@Autowired
	private TbHallMapper hallMapper;

	@Autowired
	private TbMovieMapper movieMapper;

	@Autowired
	private TbHomeDataMapper homeDataMapper;

	@Autowired
	private TbCinemaMapper cinemaMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbShowings> findAll() {
		return showingsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbShowings> list=    showingsMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(String username, TbShowings showings) {
		TbSellers seller = sellersMapper.selectByPrimaryKey(username);
		TbHall hall = hallMapper.selectByPrimaryKey(showings.getHallId());
		//判断添加人和当前登录是否是一个人
		if(!(seller.getCinemaId()+"").equals(hall.getCinemaId()+"")){
			int a = 2/0;
		}
		showings.setCinemaId(hall.getCinemaId());
		showings.setSeat(hall.getSeat());
		//获取电影时长 算出结束时间
		TbMovie tbMovie = movieMapper.selectByPrimaryKey(showings.getMovId());
		int min = Integer.parseInt(tbMovie.getMovTime());
		showings.setEndTime(new Date(showings.getPlayTime().getTime()+min*60*1000));


		//判断是否时间会交集
		TbShowingsExample example = new TbShowingsExample();
		TbShowingsExample.Criteria criteria = example.createCriteria();
		criteria.andHallIdEqualTo(showings.getHallId());
		criteria.andEndTimeGreaterThanOrEqualTo(showings.getPlayTime());
		criteria.andPlayTimeLessThanOrEqualTo(showings.getEndTime());
		List<TbShowings> tbShowings = showingsMapper.selectByExample(example);
		if(tbShowings.size()>0){
			int a = 2/0;
		}

		//添加到主页显示信息
		TbHomeDataExample homeDataExample = new TbHomeDataExample();
		TbHomeDataExample.Criteria criteria1 = homeDataExample.createCriteria();
		criteria1.andCinemaIdEqualTo(showings.getCinemaId());
		criteria1.andMovIdEqualTo(showings.getMovId());
		List<TbHomeData> homeDataList = homeDataMapper.selectByExample(homeDataExample);
		if (homeDataList.size()==0){
			TbHomeData homeData = new TbHomeData();
			homeData.setCinemaId(showings.getCinemaId());
			TbCinema cinema = cinemaMapper.selectByPrimaryKey(showings.getCinemaId());
			homeData.setCityId(cinema.getCityId());
			homeData.setMovId(tbMovie.getMovId());
			homeData.setMovName(tbMovie.getMovName());
			homeData.setMovPic1(tbMovie.getMovPic1());
			homeDataMapper.insert(homeData);
		}

		showingsMapper.insert(showings);


	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbShowings showings){
		showingsMapper.updateByPrimaryKey(showings);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbShowings findOne(Long showId){
		return showingsMapper.selectByPrimaryKey(showId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] showIds) {
		for(Long showId:showIds){
			showingsMapper.deleteByPrimaryKey(showId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbShowings showings, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbShowingsExample example=new TbShowingsExample();
		TbShowingsExample.Criteria criteria = example.createCriteria();
		
		if(showings!=null){			
						if(showings.getHallName()!=null && showings.getHallName().length()>0){
				criteria.andHallNameLike("%"+showings.getHallName()+"%");
			}			if(showings.getSeat()!=null && showings.getSeat().length()>0){
				criteria.andSeatLike("%"+showings.getSeat()+"%");
			}			if(showings.getSpare()!=null && showings.getSpare().length()>0){
				criteria.andSpareLike("%"+showings.getSpare()+"%");
			}	
		}
		
		List<TbShowings> list= showingsMapper.selectByExample(example);
		return new PageInfo(list);


	}
//	@Test
//	public void dd(){
//		Date date = new Date();
//		System.out.println(System.currentTimeMillis());
//		System.out.println(date.getTime());
//		long l = date.getTime() + 5 * 60000;
//		Date d = new Date(l);
//		System.out.println(date);
//		System.out.println(d);
//	}

}
