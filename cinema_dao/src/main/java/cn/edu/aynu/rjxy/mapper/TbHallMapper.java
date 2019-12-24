package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbHall;
import cn.edu.aynu.rjxy.pojo.TbHallExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbHallMapper {
    long countByExample(TbHallExample example);

    int deleteByExample(TbHallExample example);

    int deleteByPrimaryKey(Long hallId);

    int insert(TbHall record);

    int insertSelective(TbHall record);

    List<TbHall> selectByExample(TbHallExample example);

    TbHall selectByPrimaryKey(Long hallId);

    int updateByExampleSelective(@Param("record") TbHall record, @Param("example") TbHallExample example);

    int updateByExample(@Param("record") TbHall record, @Param("example") TbHallExample example);

    int updateByPrimaryKeySelective(TbHall record);

    int updateByPrimaryKey(TbHall record);
}