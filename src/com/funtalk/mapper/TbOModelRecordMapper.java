package com.funtalk.mapper;

import com.funtalk.pojo.TbOModelRecord;
import com.funtalk.pojo.TbOModelRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOModelRecordMapper {
    int countByExample(TbOModelRecordExample example);

    int deleteByExample(TbOModelRecordExample example);

    int insert(TbOModelRecord record);

    int insertSelective(TbOModelRecord record);

    List<TbOModelRecord> selectByExample(TbOModelRecordExample example);

    int updateByExampleSelective(@Param("record") TbOModelRecord record, @Param("example") TbOModelRecordExample example);

    int updateByExample(@Param("record") TbOModelRecord record, @Param("example") TbOModelRecordExample example);
}