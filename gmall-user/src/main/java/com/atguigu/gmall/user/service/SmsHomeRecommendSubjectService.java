package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsHomeRecommendSubject;
public interface SmsHomeRecommendSubjectService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendSubject record);

    int insertSelective(SmsHomeRecommendSubject record);

    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendSubject record);

    int updateByPrimaryKey(SmsHomeRecommendSubject record);

}
