package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberLevelService;
import com.atguigu.gmall.user.mapper.UmsMemberLevelMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService{

    @Resource
    private UmsMemberLevelMapper umsMemberLevelMapper;

}
