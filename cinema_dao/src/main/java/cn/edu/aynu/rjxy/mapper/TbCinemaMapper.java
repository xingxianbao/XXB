package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbCinema;
import cn.edu.aynu.rjxy.pojo.TbCinemaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCinemaMapper {
    long countByExample(TbCinemaExample example);

    int deleteByExample(TbCinemaExample example);

    int deleteByPrimaryKey(Long cinemaId);

    int insert(TbCinema record);

    int insertSelective(TbCinema record);

    List<TbCinema> selectByExample(TbCinemaExample example);

    TbCinema selectByPrimaryKey(Long cinemaId);

    int updateByExampleSelective(@Param("record") TbCinema record, @Param("example") TbCinemaExample example);

    int updateByExample(@Param("record") TbCinema record, @Param("example") TbCinemaExample example);

    int updateByPrimaryKeySelective(TbCinema record);

    int updateByPrimaryKey(TbCinema record);
}