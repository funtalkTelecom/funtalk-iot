package com.funtalk.mapper;

import com.funtalk.pojo.TbSBillmode;
import com.funtalk.pojo.TbSBillmodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSBillmodeMapper {
    int countByExample(TbSBillmodeExample example);

    int deleteByExample(TbSBillmodeExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(TbSBillmode record);

    int insertSelective(TbSBillmode record);

    List<TbSBillmode> selectByExample(TbSBillmodeExample example);

    TbSBillmode selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") TbSBillmode record, @Param("example") TbSBillmodeExample example);

    int updateByExample(@Param("record") TbSBillmode record, @Param("example") TbSBillmodeExample example);

    int updateByPrimaryKeySelective(TbSBillmode record);

    int updateByPrimaryKey(TbSBillmode record);

    List<TbSBillmode> selectAll();

}