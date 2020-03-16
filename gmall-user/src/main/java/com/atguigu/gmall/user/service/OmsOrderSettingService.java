package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.OmsOrderSetting;
public interface OmsOrderSettingService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderSetting record);

    int insertSelective(OmsOrderSetting record);

    OmsOrderSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderSetting record);

    int updateByPrimaryKey(OmsOrderSetting record);

}
