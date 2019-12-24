package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbPaymentBill;
import cn.edu.aynu.rjxy.pojo.TbPaymentBillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPaymentBillMapper {
    long countByExample(TbPaymentBillExample example);

    int deleteByExample(TbPaymentBillExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(TbPaymentBill record);

    int insertSelective(TbPaymentBill record);

    List<TbPaymentBill> selectByExample(TbPaymentBillExample example);

    TbPaymentBill selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") TbPaymentBill record, @Param("example") TbPaymentBillExample example);

    int updateByExample(@Param("record") TbPaymentBill record, @Param("example") TbPaymentBillExample example);

    int updateByPrimaryKeySelective(TbPaymentBill record);

    int updateByPrimaryKey(TbPaymentBill record);
}