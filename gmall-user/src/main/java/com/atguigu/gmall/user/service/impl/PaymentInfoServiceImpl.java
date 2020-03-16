package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PaymentInfoService;
import com.atguigu.gmall.user.mapper.PaymentInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentInfoServiceImpl implements PaymentInfoService{

    @Resource
    private PaymentInfoMapper paymentInfoMapper;

}
