package com.funtalk.mapper;

import com.funtalk.pojo.TbSSubtask;
import com.funtalk.pojo.TbSTaskA;
import com.funtalk.pojo.TbSTaskAExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbSTaskAMapper {
    int countByExample(TbSTaskAExample example);

    int deleteByExample(TbSTaskAExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TbSTaskA record);

    int insertSelective(TbSTaskA record);

    List<TbSTaskA> selectByExample(TbSTaskAExample example);

    TbSTaskA selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TbSTaskA record, @Param("example") TbSTaskAExample example);

    int updateByExample(@Param("record") TbSTaskA record, @Param("example") TbSTaskAExample example);

    int updateByPrimaryKeySelective(TbSTaskA record);

    int updateByPrimaryKey(TbSTaskA record);

    List<TbSTaskA> selectUndealtTask();
    List<TbSTaskA> selectProcessingTask();
    List<TbSTaskA> selectRelevantTasks(@Param("cardId") String cardId);
    int updateTaskStateByiId(@Param("taskId") Integer taskId);

    int updateStatus(Map<String, Object> paramMap);

    int updateStateByOrderAndPhone(@Param("orderNo")String orderNo,
                            @Param("phoneAList")List<String> phoneAList,
                            @Param("state")String state);

    List<TbSTaskA> selectProcessingTask(@Param("cardId") String cardId);

    List<TbSTaskA>  getNeedNoticeSms();
    int updateNoticeStatus(@Param("subtask") TbSTaskA subtask);

}