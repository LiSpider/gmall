package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsHomeRecommendProduct;
public interface SmsHomeRecommendProductService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendProduct record);

    int insertSelective(SmsHomeRecommendProduct record);

    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    int updateByPrimaryKey(SmsHomeRecommendProduct record);

}
