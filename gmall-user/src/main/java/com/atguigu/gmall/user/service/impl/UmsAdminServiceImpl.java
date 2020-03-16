package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsAdminService;
import com.atguigu.gmall.user.mapper.UmsAdminMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsAdminServiceImpl implements UmsAdminService{

    @Resource
    private UmsAdminMapper umsAdminMapper;

}
