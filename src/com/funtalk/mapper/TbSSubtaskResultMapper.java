package com.funtalk.mapper;

import com.funtalk.pojo.TbSSubtaskResult;
import com.funtalk.pojo.TbSSubtaskResultExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSSubtaskResultMapper {
    int countByExample(TbSSubtaskResultExample example);

    int deleteByExample(TbSSubtaskResultExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(TbSSubtaskResult record);

    int insertSelective(TbSSubtaskResult record);

    List<TbSSubtaskResult> selectByExample(TbSSubtaskResultExample example);

    TbSSubtaskResult selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") TbSSubtaskResult record, @Param("example") TbSSubtaskResultExample example);

    int updateByExample(@Param("record") TbSSubtaskResult record, @Param("example") TbSSubtaskResultExample example);

    int updateByPrimaryKeySelective(TbSSubtaskResult record);

    int updateByPrimaryKey(TbSSubtaskResult record);

    List<TbSSubtaskResult> selectByState(String  state);

    int updateState(@Param("state")String state,@Param("info")String info,@Param("stateList")List<Integer> stateList);

    int updateStateByPhoneA(@Param("orderNo")String orderNo,
                            @Param("phoneAList")List<String> phoneAList,
                            @Param("state")String state);

}