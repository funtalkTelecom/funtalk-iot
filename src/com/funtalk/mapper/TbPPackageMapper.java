package com.funtalk.mapper;

import com.funtalk.pojo.TbPPackage;
import com.funtalk.pojo.TbPPackageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPPackageMapper  {
    int countByExample(TbPPackageExample example);

    int deleteByExample(TbPPackageExample example);

    int deleteByPrimaryKey(Integer packageId);

    int insert(TbPPackage record);

    int insertSelective(TbPPackage record);

    List<TbPPackage> selectByExample(TbPPackageExample example);

    TbPPackage selectByPrimaryKey(Integer packageId);

    int updateByExampleSelective(@Param("record") TbPPackage record, @Param("example") TbPPackageExample example);

    int updateByExample(@Param("record") TbPPackage record, @Param("example") TbPPackageExample example);

    int updateByPrimaryKeySelective(TbPPackage record);

    int updateByPrimaryKey(TbPPackage record);
}