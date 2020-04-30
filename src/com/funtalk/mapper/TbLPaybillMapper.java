package com.funtalk.mapper;

import com.funtalk.pojo.TbLPaybill;
import com.funtalk.pojo.TbLPaybillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbLPaybillMapper {
    int countByExample(TbLPaybillExample example);

    int deleteByExample(TbLPaybillExample example);

    int deleteByPrimaryKey(Integer payId);

    int insert(TbLPaybill record);

    int insertSelective(TbLPaybill record);

    List<TbLPaybill> selectByExample(TbLPaybillExample example);

    TbLPaybill selectByPrimaryKey(Integer payId);

    int updateByExampleSelective(@Param("record") TbLPaybill record, @Param("example") TbLPaybillExample example);

    int updateByExample(@Param("record") TbLPaybill record, @Param("example") TbLPaybillExample example);

    int updateByPrimaryKeySelective(TbLPaybill record);

    int updateByPrimaryKey(TbLPaybill record);
}