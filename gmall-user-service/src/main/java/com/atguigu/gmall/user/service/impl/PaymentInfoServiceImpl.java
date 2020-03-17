package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PaymentInfoService;
import com.atguigu.gmall.user.mapper.PaymentInfoMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PaymentInfoServiceImpl implements PaymentInfoService{

    @Resource
    private PaymentInfoMapper paymentInfoMapper;

}
