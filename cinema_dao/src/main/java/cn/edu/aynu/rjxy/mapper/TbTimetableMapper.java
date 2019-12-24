package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbTimetable;
import cn.edu.aynu.rjxy.pojo.TbTimetableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTimetableMapper {
    long countByExample(TbTimetableExample example);

    int deleteByExample(TbTimetableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTimetable record);

    int insertSelective(TbTimetable record);

    List<TbTimetable> selectByExample(TbTimetableExample example);

    TbTimetable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTimetable record, @Param("example") TbTimetableExample example);

    int updateByExample(@Param("record") TbTimetable record, @Param("example") TbTimetableExample example);

    int updateByPrimaryKeySelective(TbTimetable record);

    int updateByPrimaryKey(TbTimetable record);
}