package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductLadderService;
import com.atguigu.gmall.user.mapper.PmsProductLadderMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsProductLadderServiceImpl implements PmsProductLadderService{

    @Resource
    private PmsProductLadderMapper pmsProductLadderMapper;

}
