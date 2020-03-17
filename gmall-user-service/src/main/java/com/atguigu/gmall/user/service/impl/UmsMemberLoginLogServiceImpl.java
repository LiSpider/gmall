package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberLoginLogService;
import com.atguigu.gmall.user.mapper.UmsMemberLoginLogMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService{

    @Resource
    private UmsMemberLoginLogMapper umsMemberLoginLogMapper;

}
