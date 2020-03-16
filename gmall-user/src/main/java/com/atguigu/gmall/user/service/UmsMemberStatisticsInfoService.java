package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMemberStatisticsInfo;
public interface UmsMemberStatisticsInfoService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberStatisticsInfo record);

    int insertSelective(UmsMemberStatisticsInfo record);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    int updateByPrimaryKey(UmsMemberStatisticsInfo record);

}
