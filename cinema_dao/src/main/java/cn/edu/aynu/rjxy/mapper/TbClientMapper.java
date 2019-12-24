package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbClient;
import cn.edu.aynu.rjxy.pojo.TbClientExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbClientMapper {
    long countByExample(TbClientExample example);

    int deleteByExample(TbClientExample example);

    int deleteByPrimaryKey(Long clientId);

    int insert(TbClient record);

    int insertSelective(TbClient record);

    List<TbClient> selectByExample(TbClientExample example);

    TbClient selectByPrimaryKey(Long clientId);

    int updateByExampleSelective(@Param("record") TbClient record, @Param("example") TbClientExample example);

    int updateByExample(@Param("record") TbClient record, @Param("example") TbClientExample example);

    int updateByPrimaryKeySelective(TbClient record);

    int updateByPrimaryKey(TbClient record);
}