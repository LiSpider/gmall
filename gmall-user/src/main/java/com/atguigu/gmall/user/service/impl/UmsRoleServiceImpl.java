package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsRoleService;
import com.atguigu.gmall.user.mapper.UmsRoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsRoleServiceImpl implements UmsRoleService{

    @Resource
    private UmsRoleMapper umsRoleMapper;

}
