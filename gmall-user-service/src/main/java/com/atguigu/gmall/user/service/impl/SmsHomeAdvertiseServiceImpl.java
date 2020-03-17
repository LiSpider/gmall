package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsHomeAdvertiseService;
import com.atguigu.gmall.user.mapper.SmsHomeAdvertiseMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class SmsHomeAdvertiseServiceImpl implements SmsHomeAdvertiseService{

    @Resource
    private SmsHomeAdvertiseMapper smsHomeAdvertiseMapper;

}
