package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.OmsOrderItemService;
import com.atguigu.gmall.user.mapper.OmsOrderItemMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class OmsOrderItemServiceImpl implements OmsOrderItemService{

    @Resource
    private OmsOrderItemMapper omsOrderItemMapper;

}
