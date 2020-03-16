package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsCouponProductCategoryRelationService;
import com.atguigu.gmall.user.mapper.SmsCouponProductCategoryRelationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsCouponProductCategoryRelationServiceImpl implements SmsCouponProductCategoryRelationService{

    @Resource
    private SmsCouponProductCategoryRelationMapper smsCouponProductCategoryRelationMapper;

}
