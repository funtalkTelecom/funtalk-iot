package com.funtalk.mapper;

import com.funtalk.pojo.TbPPhoneChannel;
import com.funtalk.pojo.TbPPhoneChannelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPPhoneChannelMapper  {
    int countByExample(TbPPhoneChannelExample example);

    int deleteByExample(TbPPhoneChannelExample example);

    int insert(TbPPhoneChannel record);

    int insertSelective(TbPPhoneChannel record);

    List<TbPPhoneChannel> selectByExample(TbPPhoneChannelExample example);

    int updateByExampleSelective(@Param("record") TbPPhoneChannel record, @Param("example") TbPPhoneChannelExample example);

    int updateByExample(@Param("record") TbPPhoneChannel record, @Param("example") TbPPhoneChannelExample example);
}