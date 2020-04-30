package com.funtalk.mapper;

import com.funtalk.pojo.TbSEmployee;
import com.funtalk.pojo.TbSEmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSEmployeeMapper {
    int countByExample(TbSEmployeeExample example);

    int deleteByExample(TbSEmployeeExample example);

    int insert(TbSEmployee record);

    int insertSelective(TbSEmployee record);

    List<TbSEmployee> selectByExample(TbSEmployeeExample example);

    int updateByExampleSelective(@Param("record") TbSEmployee record, @Param("example") TbSEmployeeExample example);

    int updateStateById(@Param("employeeId")Integer employeeId,@Param("state")String state);

}