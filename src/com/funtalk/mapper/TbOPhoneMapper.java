package com.funtalk.mapper;

import com.funtalk.pojo.TbOPhone;
import com.funtalk.pojo.TbOPhoneExample;
import com.funtalk.vo.TbOPhoneCount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOPhoneMapper {
    int countByExample(TbOPhoneExample example);

    int deleteByExample(TbOPhoneExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(TbOPhone record);

    int insertSelective(TbOPhone record);

    List<TbOPhone> selectByExample(TbOPhoneExample example);

    TbOPhone selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") TbOPhone record, @Param("example") TbOPhoneExample example);

    int updateByExample(@Param("record") TbOPhone record, @Param("example") TbOPhoneExample example);

    int updateByPrimaryKeySelective(TbOPhone record);

    int updateByPrimaryKey(TbOPhone record);

    List<TbOPhoneCount> getPhoneCounts(int size);

    int updateUseCount(Integer orderId,int count);

}