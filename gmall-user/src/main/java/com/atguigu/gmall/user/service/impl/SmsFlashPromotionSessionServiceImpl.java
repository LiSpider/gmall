package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsFlashPromotionSessionService;
import com.atguigu.gmall.user.mapper.SmsFlashPromotionSessionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsFlashPromotionSessionServiceImpl implements SmsFlashPromotionSessionService{

    @Resource
    private SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper;

}
