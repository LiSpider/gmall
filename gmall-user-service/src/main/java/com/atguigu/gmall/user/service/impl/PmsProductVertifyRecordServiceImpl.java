package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductVertifyRecordService;
import com.atguigu.gmall.user.mapper.PmsProductVertifyRecordMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsProductVertifyRecordServiceImpl implements PmsProductVertifyRecordService{

    @Resource
    private PmsProductVertifyRecordMapper pmsProductVertifyRecordMapper;

}
