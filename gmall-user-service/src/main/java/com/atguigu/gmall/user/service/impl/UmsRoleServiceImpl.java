package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsRoleService;
import com.atguigu.gmall.user.mapper.UmsRoleMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsRoleServiceImpl implements UmsRoleService{

    @Resource
    private UmsRoleMapper umsRoleMapper;

}
