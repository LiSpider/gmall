package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.OmsOrderService;
import com.atguigu.gmall.user.mapper.OmsOrderMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class OmsOrderServiceImpl implements OmsOrderService{

    @Resource
    private OmsOrderMapper omsOrderMapper;

}
