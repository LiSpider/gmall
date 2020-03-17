package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsSkuImageService;
import com.atguigu.gmall.user.mapper.PmsSkuImageMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsSkuImageServiceImpl implements PmsSkuImageService{

    @Resource
    private PmsSkuImageMapper pmsSkuImageMapper;

}
