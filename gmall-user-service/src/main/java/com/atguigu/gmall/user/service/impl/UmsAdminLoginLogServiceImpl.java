package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsAdminLoginLogService;
import com.atguigu.gmall.user.mapper.UmsAdminLoginLogMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsAdminLoginLogServiceImpl implements UmsAdminLoginLogService{

    @Resource
    private UmsAdminLoginLogMapper umsAdminLoginLogMapper;

}
