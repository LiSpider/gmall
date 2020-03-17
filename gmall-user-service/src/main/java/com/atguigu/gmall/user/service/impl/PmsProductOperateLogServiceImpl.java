package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductOperateLogService;
import com.atguigu.gmall.user.mapper.PmsProductOperateLogMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsProductOperateLogServiceImpl implements PmsProductOperateLogService{

    @Resource
    private PmsProductOperateLogMapper pmsProductOperateLogMapper;

}
