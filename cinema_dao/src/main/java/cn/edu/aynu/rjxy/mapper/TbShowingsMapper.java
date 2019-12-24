package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbShowings;
import cn.edu.aynu.rjxy.pojo.TbShowingsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbShowingsMapper {
    long countByExample(TbShowingsExample example);

    int deleteByExample(TbShowingsExample example);

    int deleteByPrimaryKey(Long showId);

    int insert(TbShowings record);

    int insertSelective(TbShowings record);

    List<TbShowings> selectByExample(TbShowingsExample example);

    TbShowings selectByPrimaryKey(Long showId);

    int updateByExampleSelective(@Param("record") TbShowings record, @Param("example") TbShowingsExample example);

    int updateByExample(@Param("record") TbShowings record, @Param("example") TbShowingsExample example);

    int updateByPrimaryKeySelective(TbShowings record);

    int updateByPrimaryKey(TbShowings record);
}