package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberLoginLogService;
import com.atguigu.gmall.user.mapper.UmsMemberLoginLogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService{

    @Resource
    private UmsMemberLoginLogMapper umsMemberLoginLogMapper;

}
