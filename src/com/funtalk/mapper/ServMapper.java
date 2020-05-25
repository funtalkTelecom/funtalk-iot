package com.funtalk.mapper;

import com.funtalk.pojo.Serv;
import com.funtalk.pojo.ServExample;
import com.funtalk.pojo.SimpleServ;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ServMapper {

    int countByExample(ServExample example);

    int deleteByExample(ServExample example);

    int insert(Serv record);

    int insertSelective(Serv record);

    List<Serv> selectByExample(ServExample example);

    int updateByExampleSelective(@Param("record") Serv record, @Param("example") ServExample example);

    int updateByExample(@Param("record") Serv record, @Param("example") ServExample example);

    List<SimpleServ>  selectStateByAccnbrForBatch(@Param("accnbrList") List<SimpleServ> accnbrList);

}