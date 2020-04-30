package com.funtalk.mapper;

import com.funtalk.pojo.TbPKeywords;
import com.funtalk.pojo.TbPKeywordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPKeywordsMapper {
    int countByExample(TbPKeywordsExample example);

    int deleteByExample(TbPKeywordsExample example);

    int insert(TbPKeywords record);

    int insertSelective(TbPKeywords record);

    List<TbPKeywords> selectByExample(TbPKeywordsExample example);

    int updateByExampleSelective(@Param("record") TbPKeywords record, @Param("example") TbPKeywordsExample example);

    int updateByExample(@Param("record") TbPKeywords record, @Param("example") TbPKeywordsExample example);
}