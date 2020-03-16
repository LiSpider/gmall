package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsHomeRecommendProductService;
import com.atguigu.gmall.user.mapper.SmsHomeRecommendProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsHomeRecommendProductServiceImpl implements SmsHomeRecommendProductService{

    @Resource
    private SmsHomeRecommendProductMapper smsHomeRecommendProductMapper;

}
