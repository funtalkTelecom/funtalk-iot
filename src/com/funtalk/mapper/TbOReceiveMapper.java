package com.funtalk.mapper;

import com.funtalk.pojo.TbOReceive;
import com.funtalk.pojo.TbOReceiveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOReceiveMapper {
    int countByExample(TbOReceiveExample example);

    int deleteByExample(TbOReceiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOReceive record);

    int insertSelective(TbOReceive record);

    List<TbOReceive> selectByExample(TbOReceiveExample example);

    TbOReceive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOReceive record, @Param("example") TbOReceiveExample example);

    int updateByExample(@Param("record") TbOReceive record, @Param("example") TbOReceiveExample example);

    int updateByPrimaryKeySelective(TbOReceive record);

    int updateByPrimaryKey(TbOReceive record);
}