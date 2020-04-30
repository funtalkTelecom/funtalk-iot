package com.funtalk.mapper;

import com.funtalk.pojo.TbSCustPrice;
import com.funtalk.pojo.TbSCustPriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSCustPriceMapper {
    int countByExample(TbSCustPriceExample example);

    int deleteByExample(TbSCustPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSCustPrice record);

    int insertSelective(TbSCustPrice record);

    List<TbSCustPrice> selectByExample(TbSCustPriceExample example);

    TbSCustPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSCustPrice record, @Param("example") TbSCustPriceExample example);

    int updateByExample(@Param("record") TbSCustPrice record, @Param("example") TbSCustPriceExample example);

    int updateByPrimaryKeySelective(TbSCustPrice record);

    int updateByPrimaryKey(TbSCustPrice record);
}