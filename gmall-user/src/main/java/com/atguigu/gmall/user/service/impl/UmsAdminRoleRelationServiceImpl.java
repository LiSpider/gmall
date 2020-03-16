package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsAdminRoleRelationService;
import com.atguigu.gmall.user.mapper.UmsAdminRoleRelationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsAdminRoleRelationServiceImpl implements UmsAdminRoleRelationService{

    @Resource
    private UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;

}
