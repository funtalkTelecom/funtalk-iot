package com.funtalk.mapper;

import com.funtalk.pojo.TbSPhone;
import com.funtalk.pojo.TbSPhoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbSPhoneMapper {

    int countByExample(TbSPhoneExample example);

    int deleteByExample(TbSPhoneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSPhone record);

    int insertSelective(TbSPhone record);

    List<TbSPhone> selectByExample(TbSPhoneExample example);

    TbSPhone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSPhone record, @Param("example") TbSPhoneExample example);

    int updateByExample(@Param("record") TbSPhone record, @Param("example") TbSPhoneExample example);

    int updateByPrimaryKeySelective(TbSPhone record);

    int updateByPrimaryKey(TbSPhone record);

    List<String>  getNoUsePhones(@Param("needPhones")int needPhones);

    int updateUseState(@Param("serviceId")String serviceId);

    TbSPhone getPhoneBaseDataByIccid(@Param("iccid")String iccid);

    Map<String,String> getPhoneDelDateForIccids(@Param("iccids")String iccids);

    int updateUseCardId(@Param("cardid")String cardid, @Param("iccid")String iccid);

    TbSPhone getCanSwitchPhone();

    int updateSwitchPhoneState(@Param("iccid")String iccid,
                                @Param("state")String state,
                                @Param("cardid")String cardid );


}