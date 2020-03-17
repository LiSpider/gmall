package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberProductCategoryRelationService;
import com.atguigu.gmall.user.mapper.UmsMemberProductCategoryRelationMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberProductCategoryRelationServiceImpl implements UmsMemberProductCategoryRelationService{

    @Resource
    private UmsMemberProductCategoryRelationMapper umsMemberProductCategoryRelationMapper;

}
