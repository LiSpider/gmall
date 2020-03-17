package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsBaseSaleAttrService;
import com.atguigu.gmall.user.mapper.PmsBaseSaleAttrMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsBaseSaleAttrServiceImpl implements PmsBaseSaleAttrService{

    @Resource
    private PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

}
