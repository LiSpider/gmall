package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsCouponProductCategoryRelationService;
import com.atguigu.gmall.user.mapper.SmsCouponProductCategoryRelationMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class SmsCouponProductCategoryRelationServiceImpl implements SmsCouponProductCategoryRelationService{

    @Resource
    private SmsCouponProductCategoryRelationMapper smsCouponProductCategoryRelationMapper;

}
