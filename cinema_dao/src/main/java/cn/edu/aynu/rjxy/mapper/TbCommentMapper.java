package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbComment;
import cn.edu.aynu.rjxy.pojo.TbCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCommentMapper {
    long countByExample(TbCommentExample example);

    int deleteByExample(TbCommentExample example);

    int deleteByPrimaryKey(Long comId);

    int insert(TbComment record);

    int insertSelective(TbComment record);

    List<TbComment> selectByExample(TbCommentExample example);

    TbComment selectByPrimaryKey(Long comId);

    int updateByExampleSelective(@Param("record") TbComment record, @Param("example") TbCommentExample example);

    int updateByExample(@Param("record") TbComment record, @Param("example") TbCommentExample example);

    int updateByPrimaryKeySelective(TbComment record);

    int updateByPrimaryKey(TbComment record);
}