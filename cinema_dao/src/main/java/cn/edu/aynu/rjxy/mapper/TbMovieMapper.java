package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbMovie;
import cn.edu.aynu.rjxy.pojo.TbMovieExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMovieMapper {
    long countByExample(TbMovieExample example);

    int deleteByExample(TbMovieExample example);

    int deleteByPrimaryKey(Long movId);

    int insert(TbMovie record);

    int insertSelective(TbMovie record);

    List<TbMovie> selectByExample(TbMovieExample example);

    TbMovie selectByPrimaryKey(Long movId);

    int updateByExampleSelective(@Param("record") TbMovie record, @Param("example") TbMovieExample example);

    int updateByExample(@Param("record") TbMovie record, @Param("example") TbMovieExample example);

    int updateByPrimaryKeySelective(TbMovie record);

    int updateByPrimaryKey(TbMovie record);
}