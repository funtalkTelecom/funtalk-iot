package com.funtalk.test.back;

import com.funtalk.pojo.TbSCardinfo;
import com.funtalk.pojo.TbSCardinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSCardinfoMapper {
    int countByExample(TbSCardinfoExample example);

    int deleteByExample(TbSCardinfoExample example);

    int deleteByPrimaryKey(Integer cardId);

    int insert(TbSCardinfo record);

    int insertSelective(TbSCardinfo record);

    List<TbSCardinfo> selectByExample(TbSCardinfoExample example);

    TbSCardinfo selectByPrimaryKey(Integer cardId);

    int updateByExampleSelective(@Param("record") TbSCardinfo record, @Param("example") TbSCardinfoExample example);

    int updateByExample(@Param("record") TbSCardinfo record, @Param("example") TbSCardinfoExample example);

    int updateByPrimaryKeySelective(TbSCardinfo record);

    int updateByPrimaryKey(TbSCardinfo record);

    List<TbSCardinfo> selectByIccidList(@Param("iccidList") List<String> iccidList);

    int updateByIccid(TbSCardinfo tbSCardinfo);

    List<TbSCardinfo> selectIdleBusinessIccid();

    List<TbSCardinfo> selectRelevantCardInfo(@Param("iccId") String iccId, @Param("seedIccId") String seedIccId);


    int recoverToInit(@Param("iccidList") List<String> iccidList);
}