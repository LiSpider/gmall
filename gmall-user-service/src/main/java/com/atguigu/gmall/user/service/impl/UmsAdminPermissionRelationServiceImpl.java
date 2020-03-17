package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsAdminPermissionRelationService;
import com.atguigu.gmall.user.mapper.UmsAdminPermissionRelationMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsAdminPermissionRelationServiceImpl implements UmsAdminPermissionRelationService{

    @Resource
    private UmsAdminPermissionRelationMapper umsAdminPermissionRelationMapper;

}
