package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsCommentService;
import com.atguigu.gmall.user.mapper.PmsCommentMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsCommentServiceImpl implements PmsCommentService{

    @Resource
    private PmsCommentMapper pmsCommentMapper;

}
