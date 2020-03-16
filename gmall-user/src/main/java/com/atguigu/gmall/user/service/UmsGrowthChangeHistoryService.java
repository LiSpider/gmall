package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsGrowthChangeHistory;
public interface UmsGrowthChangeHistoryService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsGrowthChangeHistory record);

    int insertSelective(UmsGrowthChangeHistory record);

    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    int updateByPrimaryKey(UmsGrowthChangeHistory record);

}
