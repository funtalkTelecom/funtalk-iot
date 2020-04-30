package com.funtalk.mapper;

import com.funtalk.pojo.TbOSender;
import com.funtalk.pojo.TbOSenderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOSenderMapper {
    int countByExample(TbOSenderExample example);

    int deleteByExample(TbOSenderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOSender record);

    int insertSelective(TbOSender record);

    List<TbOSender> selectByExample(TbOSenderExample example);

    TbOSender selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOSender record, @Param("example") TbOSenderExample example);

    int updateByExample(@Param("record") TbOSender record, @Param("example") TbOSenderExample example);

    int updateByPrimaryKeySelective(TbOSender record);

    int updateByPrimaryKey(TbOSender record);
}