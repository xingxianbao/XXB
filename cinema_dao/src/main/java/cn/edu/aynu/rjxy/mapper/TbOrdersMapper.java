package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbOrders;
import cn.edu.aynu.rjxy.pojo.TbOrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrdersMapper {
    long countByExample(TbOrdersExample example);

    int deleteByExample(TbOrdersExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(TbOrders record);

    int insertSelective(TbOrders record);

    List<TbOrders> selectByExample(TbOrdersExample example);

    TbOrders selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByExample(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByPrimaryKeySelective(TbOrders record);

    int updateByPrimaryKey(TbOrders record);
}