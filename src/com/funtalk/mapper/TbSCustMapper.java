package com.funtalk.mapper;

import com.funtalk.pojo.TbSCust;
import com.funtalk.pojo.TbSCustExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSCustMapper {
    int countByExample(TbSCustExample example);

    int deleteByExample(TbSCustExample example);

    int insert(TbSCust record);

    int insertSelective(TbSCust record);

    List<TbSCust> selectByExample(TbSCustExample example);

    int updateByExampleSelective(@Param("record") TbSCust record, @Param("example") TbSCustExample example);

    int updateByExample(@Param("record") TbSCust record, @Param("example") TbSCustExample example);


    int updateStateById(@Param("custId")String custId,@Param("state")String state);


}