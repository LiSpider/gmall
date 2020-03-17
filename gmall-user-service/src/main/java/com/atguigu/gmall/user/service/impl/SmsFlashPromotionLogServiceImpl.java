package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsFlashPromotionLogService;
import com.atguigu.gmall.user.mapper.SmsFlashPromotionLogMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class SmsFlashPromotionLogServiceImpl implements SmsFlashPromotionLogService{

    @Resource
    private SmsFlashPromotionLogMapper smsFlashPromotionLogMapper;

}
