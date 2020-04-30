package com.funtalk.mapper;

import com.funtalk.pojo.TbSCard;
import com.funtalk.pojo.TbSCardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSCardMapper {
    int countByExample(TbSCardExample example);

    int deleteByExample(TbSCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSCard record);

    int insertSelective(TbSCard record);

    List<TbSCard> selectByExample(TbSCardExample example);

    TbSCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSCard record, @Param("example") TbSCardExample example);

    int updateByExample(@Param("record") TbSCard record, @Param("example") TbSCardExample example);

    int updateByPrimaryKeySelective(TbSCard record);

    int updateByPrimaryKey(TbSCard record);


}