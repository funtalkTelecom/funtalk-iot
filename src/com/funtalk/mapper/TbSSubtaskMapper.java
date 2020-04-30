package com.funtalk.mapper;

import com.funtalk.pojo.TbSSubtask;
import com.funtalk.pojo.TbSSubtaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbSSubtaskMapper {
    int countByExample(TbSSubtaskExample example);

    int deleteByExample(TbSSubtaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TbSSubtask record);

    int insertSelective(TbSSubtask record);

    List<TbSSubtask> selectByExample(TbSSubtaskExample example);

    TbSSubtask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TbSSubtask record, @Param("example") TbSSubtaskExample example);

    int updateByExample(@Param("record") TbSSubtask record, @Param("example") TbSSubtaskExample example);

    int updateByPrimaryKeySelective(TbSSubtask record);

    int updateByPrimaryKey(TbSSubtask record);

    List<TbSSubtask> selectUndealtTask();

    int updateStatus(Map<String, Object> paramMap);
}