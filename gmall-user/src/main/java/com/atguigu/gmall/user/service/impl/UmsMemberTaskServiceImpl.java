package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberTaskService;
import com.atguigu.gmall.user.mapper.UmsMemberTaskMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberTaskServiceImpl implements UmsMemberTaskService{

    @Resource
    private UmsMemberTaskMapper umsMemberTaskMapper;

}
