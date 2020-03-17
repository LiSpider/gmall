package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsCouponProductRelationService;
import com.atguigu.gmall.user.mapper.SmsCouponProductRelationMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class SmsCouponProductRelationServiceImpl implements SmsCouponProductRelationService{

    @Resource
    private SmsCouponProductRelationMapper smsCouponProductRelationMapper;

}
