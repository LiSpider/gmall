package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsPermissionService;
import com.atguigu.gmall.user.mapper.UmsPermissionMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsPermissionServiceImpl implements UmsPermissionService{

    @Resource
    private UmsPermissionMapper umsPermissionMapper;

}
