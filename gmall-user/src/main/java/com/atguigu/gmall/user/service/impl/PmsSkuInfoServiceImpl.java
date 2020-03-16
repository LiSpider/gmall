package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsSkuInfoService;
import com.atguigu.gmall.user.mapper.PmsSkuInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService{

    @Resource
    private PmsSkuInfoMapper pmsSkuInfoMapper;

}
