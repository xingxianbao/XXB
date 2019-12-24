package cn.edu.aynu.rjxy.management.service.impl;
import cn.edu.aynu.rjxy.management.service.CommentService;
import cn.edu.aynu.rjxy.mapper.TbCommentMapper;
import cn.edu.aynu.rjxy.pojo.TbComment;
import cn.edu.aynu.rjxy.pojo.TbCommentExample;
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
public class CommentServiceImpl implements CommentService {

	@Autowired
	private TbCommentMapper commentMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbComment> findAll() {
		return commentMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageInfo findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbComment> list=    commentMapper.selectByExample(null);
		return new PageInfo(list);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbComment comment) {
		commentMapper.insert(comment);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbComment comment){
		commentMapper.updateByPrimaryKey(comment);
	}	
	
	/**
	 * 根据ID获取实体
	 * @return
	 */
	@Override
	public TbComment findOne(Long comId){
		return commentMapper.selectByPrimaryKey(comId);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] comIds) {
		for(Long comId:comIds){
			commentMapper.deleteByPrimaryKey(comId);
		}		
	}
	
	
	@Override
	public PageInfo findPage(TbComment comment, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCommentExample example=new TbCommentExample();
		TbCommentExample.Criteria criteria = example.createCriteria();
		
		if(comment!=null){			
						if(comment.getMovName()!=null && comment.getMovName().length()>0){
				criteria.andMovNameLike("%"+comment.getMovName()+"%");
			}			if(comment.getContent()!=null && comment.getContent().length()>0){
				criteria.andContentLike("%"+comment.getContent()+"%");
			}			if(comment.getScore()!=null && comment.getScore().length()>0){
				criteria.andScoreLike("%"+comment.getScore()+"%");
			}			if(comment.getClientName()!=null && comment.getClientName().length()>0){
				criteria.andClientNameLike("%"+comment.getClientName()+"%");
			}			if(comment.getSpare()!=null && comment.getSpare().length()>0){
				criteria.andSpareLike("%"+comment.getSpare()+"%");
			}	
		}
		
		List<TbComment> list= commentMapper.selectByExample(example);
		return new PageInfo(list);
	}
	
}
