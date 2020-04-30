package com.funtalk.mapper;

import com.funtalk.pojo.TbSCardinfo;
import com.funtalk.pojo.TbSCardinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbSCardinfoMapper {
    int countByExample(TbSCardinfoExample example);

    int deleteByExample(TbSCardinfoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(TbSCardinfo record);

    int insertSelective(TbSCardinfo record);

    List<TbSCardinfo> selectByExample(TbSCardinfoExample example);

    TbSCardinfo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") TbSCardinfo record, @Param("example") TbSCardinfoExample example);

    int updateByExample(@Param("record") TbSCardinfo record, @Param("example") TbSCardinfoExample example);

    int updateByPrimaryKeySelective(TbSCardinfo record);

    int updateByPrimaryKey(TbSCardinfo record);

    List<TbSCardinfo> selectByIccidList(@Param("iccidList") List<String> iccidList);

    int updateByIccid(TbSCardinfo tbSCardinfo);

    List<TbSCardinfo> selectIdleBusinessIccid(@Param("custId") String custId);

    List<TbSCardinfo> selectRelevantCardInfo(@Param("iccId") String iccId,@Param("seedIccId") String seedIccId);


    int recoverToInit(@Param("iccidList") List<String> iccidList);

    int updateCardId(@Param("cardId") String cardId,@Param("iccId") String iccId);
}