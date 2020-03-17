package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsSubjectCommentService;
import com.atguigu.gmall.user.mapper.CmsSubjectCommentMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class CmsSubjectCommentServiceImpl implements CmsSubjectCommentService{

    @Resource
    private CmsSubjectCommentMapper cmsSubjectCommentMapper;

}
