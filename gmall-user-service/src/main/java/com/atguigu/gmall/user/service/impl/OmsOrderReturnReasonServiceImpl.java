package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.OmsOrderReturnReasonService;
import com.atguigu.gmall.user.mapper.OmsOrderReturnReasonMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService{

    @Resource
    private OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

}
