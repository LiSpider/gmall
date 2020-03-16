package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsFlashPromotion;
public interface SmsFlashPromotionService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotion record);

    int insertSelective(SmsFlashPromotion record);

    SmsFlashPromotion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotion record);

    int updateByPrimaryKey(SmsFlashPromotion record);

}
