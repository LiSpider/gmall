package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberStatisticsInfoService;
import com.atguigu.gmall.user.mapper.UmsMemberStatisticsInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService{

    @Resource
    private UmsMemberStatisticsInfoMapper umsMemberStatisticsInfoMapper;

}
