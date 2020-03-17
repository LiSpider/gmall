package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsAdminService;
import com.atguigu.gmall.user.mapper.UmsAdminMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsAdminServiceImpl implements UmsAdminService{

    @Resource
    private UmsAdminMapper umsAdminMapper;

}
