package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbSellers;
import cn.edu.aynu.rjxy.pojo.TbSellersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSellersMapper {
    long countByExample(TbSellersExample example);

    int deleteByExample(TbSellersExample example);

    int deleteByPrimaryKey(String username);

    int insert(TbSellers record);

    int insertSelective(TbSellers record);

    List<TbSellers> selectByExample(TbSellersExample example);

    TbSellers selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") TbSellers record, @Param("example") TbSellersExample example);

    int updateByExample(@Param("record") TbSellers record, @Param("example") TbSellersExample example);

    int updateByPrimaryKeySelective(TbSellers record);

    int updateByPrimaryKey(TbSellers record);
}