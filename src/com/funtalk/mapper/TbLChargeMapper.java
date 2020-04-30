package com.funtalk.mapper;

import com.funtalk.pojo.TbLCharge;
import com.funtalk.pojo.TbLChargeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbLChargeMapper {
    int countByExample(TbLChargeExample example);

    int deleteByExample(TbLChargeExample example);

    int insert(TbLCharge record);

    int insertSelective(TbLCharge record);

    List<TbLCharge> selectByExampleWithBLOBs(TbLChargeExample example);

    List<TbLCharge> selectByExample(TbLChargeExample example);

    int updateByExampleSelective(@Param("record") TbLCharge record, @Param("example") TbLChargeExample example);

    int updateByExampleWithBLOBs(@Param("record") TbLCharge record, @Param("example") TbLChargeExample example);

    int updateByExample(@Param("record") TbLCharge record, @Param("example") TbLChargeExample example);
}