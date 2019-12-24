package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbType;
import cn.edu.aynu.rjxy.pojo.TbTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTypeMapper {
    long countByExample(TbTypeExample example);

    int deleteByExample(TbTypeExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(TbType record);

    int insertSelective(TbType record);

    List<TbType> selectByExample(TbTypeExample example);

    TbType selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") TbType record, @Param("example") TbTypeExample example);

    int updateByExample(@Param("record") TbType record, @Param("example") TbTypeExample example);

    int updateByPrimaryKeySelective(TbType record);

    int updateByPrimaryKey(TbType record);
}