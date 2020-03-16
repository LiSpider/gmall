package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsFlashPromotionLog;
public interface SmsFlashPromotionLogService{


    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionLog record);

    int insertSelective(SmsFlashPromotionLog record);

    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    int updateByPrimaryKey(SmsFlashPromotionLog record);

}
