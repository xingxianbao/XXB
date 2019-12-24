package cn.edu.aynu.rjxy.mapper;

import cn.edu.aynu.rjxy.pojo.TbTicket;
import cn.edu.aynu.rjxy.pojo.TbTicketExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTicketMapper {
    long countByExample(TbTicketExample example);

    int deleteByExample(TbTicketExample example);

    int deleteByPrimaryKey(Long ticketId);

    int insert(TbTicket record);

    int insertSelective(TbTicket record);

    List<TbTicket> selectByExample(TbTicketExample example);

    TbTicket selectByPrimaryKey(Long ticketId);

    int updateByExampleSelective(@Param("record") TbTicket record, @Param("example") TbTicketExample example);

    int updateByExample(@Param("record") TbTicket record, @Param("example") TbTicketExample example);

    int updateByPrimaryKeySelective(TbTicket record);

    int updateByPrimaryKey(TbTicket record);
}