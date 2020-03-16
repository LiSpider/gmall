package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.OmsOrderSetting;

public interface OmsOrderSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderSetting record);

    int insertSelective(OmsOrderSetting record);

    OmsOrderSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderSetting record);

    int updateByPrimaryKey(OmsOrderSetting record);
}