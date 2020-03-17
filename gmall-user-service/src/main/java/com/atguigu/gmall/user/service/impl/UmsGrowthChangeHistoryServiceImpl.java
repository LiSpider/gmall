package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsGrowthChangeHistoryService;
import com.atguigu.gmall.user.mapper.UmsGrowthChangeHistoryMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService{

    @Resource
    private UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper;

}
