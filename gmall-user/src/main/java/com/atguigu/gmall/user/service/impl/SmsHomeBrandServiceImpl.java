package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsHomeBrandService;
import com.atguigu.gmall.user.mapper.SmsHomeBrandMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsHomeBrandServiceImpl implements SmsHomeBrandService{

    @Resource
    private SmsHomeBrandMapper smsHomeBrandMapper;

}