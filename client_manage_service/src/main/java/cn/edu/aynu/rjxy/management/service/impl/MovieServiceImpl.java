package cn.edu.aynu.rjxy.management.service.impl;

import cn.edu.aynu.rjxy.management.service.MovieService;
import cn.edu.aynu.rjxy.mapper.TbMovieMapper;
import cn.edu.aynu.rjxy.page.service.MoviePageService;
import cn.edu.aynu.rjxy.pojo.TbMovie;
import cn.edu.aynu.rjxy.pojo.TbMovieExample;
import com.alibaba.dubbo.config.annotation.Reference;
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
public class MovieServiceImpl implements MovieService {

	@Reference
	private MoviePageService moviePageService;

	@Autowired
	private TbMovieMapper movieMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbMovie> findAll() {
		return movieMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbMovie> list=    movieMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbMovie movie) {
		movie.setIsAble(1L);
		movieMapper.insert(movie);
		System.out.println("页面生成："+moviePageService.getMovieHTML(movie));
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbMovie movie){
		movieMapper.updateByPrimaryKey(movie);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbMovie findOne(Long movId){
		return movieMapper.selectByPrimaryKey(movId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] movIds) {
		for(Long movId:movIds){
			movieMapper.deleteByPrimaryKey(movId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbMovie movie, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbMovieExample example=new TbMovieExample();

		List<TbMovie> list= movieMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
