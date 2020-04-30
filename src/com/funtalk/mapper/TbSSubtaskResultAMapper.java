package com.funtalk.mapper;

import com.funtalk.pojo.TbSSubtaskResult;
import com.funtalk.pojo.TbSSubtaskResultA;
import com.funtalk.pojo.TbSSubtaskResultAExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSSubtaskResultAMapper {
    int countByExample(TbSSubtaskResultAExample example);

    int deleteByExample(TbSSubtaskResultAExample example);

    int deleteByPrimaryKey(Integer resultId);

    int insert(TbSSubtaskResultA record);

    int insertSelective(TbSSubtaskResultA record);

    List<TbSSubtaskResultA> selectByExample(TbSSubtaskResultAExample example);

    TbSSubtaskResultA selectByPrimaryKey(Integer resultId);

    int updateByExampleSelective(@Param("record") TbSSubtaskResultA record, @Param("example") TbSSubtaskResultAExample example);

    int updateByExample(@Param("record") TbSSubtaskResultA record, @Param("example") TbSSubtaskResultAExample example);

    int updateByPrimaryKeySelective(TbSSubtaskResultA record);

    int updateByPrimaryKey(TbSSubtaskResultA record);

    List<TbSSubtaskResult> selectByState(String  state);

    int updateState(@Param("state")String state,@Param("info")String info,@Param("stateList")List<Integer> stateList);

    int updateStateByPhoneA(@Param("orderNo")String orderNo,
                            @Param("phoneAList")List<String> phoneAList,
                            @Param("state")String state);
}