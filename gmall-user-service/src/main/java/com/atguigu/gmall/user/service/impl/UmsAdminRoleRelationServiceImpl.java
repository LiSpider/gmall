package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsAdminRoleRelationService;
import com.atguigu.gmall.user.mapper.UmsAdminRoleRelationMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsAdminRoleRelationServiceImpl implements UmsAdminRoleRelationService{

    @Resource
    private UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;

}
