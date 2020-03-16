package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsFlashPromotionSession;
public interface SmsFlashPromotionSessionService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionSession record);

    int insertSelective(SmsFlashPromotionSession record);

    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    int updateByPrimaryKey(SmsFlashPromotionSession record);

}
