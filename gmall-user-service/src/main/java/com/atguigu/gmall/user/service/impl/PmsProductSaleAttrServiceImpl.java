package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductSaleAttrService;
import com.atguigu.gmall.user.mapper.PmsProductSaleAttrMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsProductSaleAttrServiceImpl implements PmsProductSaleAttrService{

    @Resource
    private PmsProductSaleAttrMapper pmsProductSaleAttrMapper;

}
