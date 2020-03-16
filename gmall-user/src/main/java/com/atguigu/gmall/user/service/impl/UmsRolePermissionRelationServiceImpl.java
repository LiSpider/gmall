package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsRolePermissionRelationService;
import com.atguigu.gmall.user.mapper.UmsRolePermissionRelationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsRolePermissionRelationServiceImpl implements UmsRolePermissionRelationService{

    @Resource
    private UmsRolePermissionRelationMapper umsRolePermissionRelationMapper;

}
