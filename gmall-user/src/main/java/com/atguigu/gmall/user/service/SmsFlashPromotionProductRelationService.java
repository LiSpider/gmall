package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsFlashPromotionProductRelation;
public interface SmsFlashPromotionProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionProductRelation record);

    int insertSelective(SmsFlashPromotionProductRelation record);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record);

    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);

}
