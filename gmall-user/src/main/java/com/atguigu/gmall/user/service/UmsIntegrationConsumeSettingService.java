package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsIntegrationConsumeSetting;
public interface UmsIntegrationConsumeSettingService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationConsumeSetting record);

    int insertSelective(UmsIntegrationConsumeSetting record);

    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);

}
