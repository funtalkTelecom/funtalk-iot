package com.funtalk.mapper;

import com.funtalk.pojo.TbUBill;
import com.funtalk.pojo.TbUBillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUBillMapper {
    int countByExample(TbUBillExample example);

    int deleteByExample(TbUBillExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(TbUBill record);

    int insertSelective(TbUBill record);

    List<TbUBill> selectByExample(TbUBillExample example);

    TbUBill selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") TbUBill record, @Param("example") TbUBillExample example);

    int updateByExample(@Param("record") TbUBill record, @Param("example") TbUBillExample example);

    int updateByPrimaryKeySelective(TbUBill record);

    int updateByPrimaryKey(TbUBill record);

    int saveBill(TbUBill record);
}