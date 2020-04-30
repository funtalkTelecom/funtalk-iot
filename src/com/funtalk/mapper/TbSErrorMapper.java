package com.funtalk.mapper;

import com.funtalk.pojo.TbSError;
import com.funtalk.pojo.TbSErrorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSErrorMapper {
    int countByExample(TbSErrorExample example);

    int deleteByExample(TbSErrorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSError record);

    int insertSelective(TbSError record);

    List<TbSError> selectByExample(TbSErrorExample example);

    TbSError selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSError record, @Param("example") TbSErrorExample example);

    int updateByExample(@Param("record") TbSError record, @Param("example") TbSErrorExample example);

    int updateByPrimaryKeySelective(TbSError record);

    int updateByPrimaryKey(TbSError record);
}