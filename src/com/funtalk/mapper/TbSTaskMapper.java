package com.funtalk.mapper;

import com.funtalk.pojo.TbSTask;
import com.funtalk.pojo.TbSTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSTaskMapper{
    int countByExample(TbSTaskExample example);

    int deleteByExample(TbSTaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TbSTask record);

    int insertSelective(TbSTask record);

    List<TbSTask> selectByExample(TbSTaskExample example);

    TbSTask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TbSTask record, @Param("example") TbSTaskExample example);

    int updateByExample(@Param("record") TbSTask record, @Param("example") TbSTaskExample example);

    int updateByPrimaryKeySelective(TbSTask record);

    int updateByPrimaryKey(TbSTask record);

    List<TbSTask> getNoAssignTasks();

    int updateYesAssignTask(Integer taskId);


}