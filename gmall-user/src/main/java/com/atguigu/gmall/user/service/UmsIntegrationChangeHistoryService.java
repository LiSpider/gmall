package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsIntegrationChangeHistory;
public interface UmsIntegrationChangeHistoryService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationChangeHistory record);

    int insertSelective(UmsIntegrationChangeHistory record);

    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    int updateByPrimaryKey(UmsIntegrationChangeHistory record);

}
