package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsHomeNewProductService;
import com.atguigu.gmall.user.mapper.SmsHomeNewProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsHomeNewProductServiceImpl implements SmsHomeNewProductService{

    @Resource
    private SmsHomeNewProductMapper smsHomeNewProductMapper;

}
