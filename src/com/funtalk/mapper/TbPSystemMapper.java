package com.funtalk.mapper;

import com.funtalk.pojo.TbPSystem;
import com.funtalk.pojo.TbPSystemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPSystemMapper   {
    int countByExample(TbPSystemExample example);

    int deleteByExample(TbPSystemExample example);

    int insert(TbPSystem record);

    int insertSelective(TbPSystem record);

    List<TbPSystem> selectByExample(TbPSystemExample example);

    int updateByExampleSelective(@Param("record") TbPSystem record, @Param("example") TbPSystemExample example);

    int updateByExample(@Param("record") TbPSystem record, @Param("example") TbPSystemExample example);
}