package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberStatisticsInfoService;
import com.atguigu.gmall.user.mapper.UmsMemberStatisticsInfoMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService{

    @Resource
    private UmsMemberStatisticsInfoMapper umsMemberStatisticsInfoMapper;

}
