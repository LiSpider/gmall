package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsFlashPromotionService;
import com.atguigu.gmall.user.mapper.SmsFlashPromotionMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class SmsFlashPromotionServiceImpl implements SmsFlashPromotionService{

    @Resource
    private SmsFlashPromotionMapper smsFlashPromotionMapper;

}
