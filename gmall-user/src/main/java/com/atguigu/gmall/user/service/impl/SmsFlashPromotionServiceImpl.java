package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsFlashPromotionService;
import com.atguigu.gmall.user.mapper.SmsFlashPromotionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsFlashPromotionServiceImpl implements SmsFlashPromotionService{

    @Resource
    private SmsFlashPromotionMapper smsFlashPromotionMapper;

}
