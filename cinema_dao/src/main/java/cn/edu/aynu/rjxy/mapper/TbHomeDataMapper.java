package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbHomeData;
import cn.edu.aynu.rjxy.pojo.TbHomeDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbHomeDataMapper {
    long countByExample(TbHomeDataExample example);

    int deleteByExample(TbHomeDataExample example);

    int deleteByPrimaryKey(Long homeId);

    int insert(TbHomeData record);

    int insertSelective(TbHomeData record);

    List<TbHomeData> selectByExample(TbHomeDataExample example);

    TbHomeData selectByPrimaryKey(Long homeId);

    int updateByExampleSelective(@Param("record") TbHomeData record, @Param("example") TbHomeDataExample example);

    int updateByExample(@Param("record") TbHomeData record, @Param("example") TbHomeDataExample example);

    int updateByPrimaryKeySelective(TbHomeData record);

    int updateByPrimaryKey(TbHomeData record);
}