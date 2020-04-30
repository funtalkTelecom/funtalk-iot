package com.funtalk.mapper;

import com.funtalk.pojo.TbSDeposit;
import com.funtalk.pojo.TbSDepositExample;
import com.funtalk.pojo.TbSEmployee;
import com.funtalk.pojo.TbSEmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSDepositMapper {
    int countByExample(TbSDepositExample example);

    int deleteByExample(TbSDepositExample example);

    int deleteByPrimaryKey(Integer depositId);

    int insert(TbSDeposit record);

    int insertSelective(TbSDeposit record);

    List<TbSDeposit> selectByExample(TbSDepositExample example);

    TbSDeposit selectByPrimaryKey(Integer depositId);

    int updateByExampleSelective(@Param("record") TbSDeposit record, @Param("example") TbSDepositExample example);

    int updateByExample(@Param("record") TbSDeposit record, @Param("example") TbSDepositExample example);

    int updateByPrimaryKeySelective(TbSDeposit record);

    int updateByPrimaryKey(TbSDeposit record);

    int updateByExample(@Param("record") TbSEmployee record, @Param("example") TbSEmployeeExample example);

    List<TbSDeposit> selectByBelongId(@Param("belongId")String  belongId);


}