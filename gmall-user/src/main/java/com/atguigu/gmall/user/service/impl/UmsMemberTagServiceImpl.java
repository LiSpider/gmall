package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberTagService;
import com.atguigu.gmall.user.mapper.UmsMemberTagMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberTagServiceImpl implements UmsMemberTagService{

    @Resource
    private UmsMemberTagMapper umsMemberTagMapper;

}
