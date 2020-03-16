package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsFlashPromotionProductRelationService;
import com.atguigu.gmall.user.mapper.SmsFlashPromotionProductRelationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService{

    @Resource
    private SmsFlashPromotionProductRelationMapper smsFlashPromotionProductRelationMapper;

}
