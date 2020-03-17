package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductFullReductionService;
import com.atguigu.gmall.user.mapper.PmsProductFullReductionMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsProductFullReductionServiceImpl implements PmsProductFullReductionService{

    @Resource
    private PmsProductFullReductionMapper pmsProductFullReductionMapper;

}
