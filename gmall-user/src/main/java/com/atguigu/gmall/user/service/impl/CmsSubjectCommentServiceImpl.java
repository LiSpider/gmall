package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsSubjectCommentService;
import com.atguigu.gmall.user.mapper.CmsSubjectCommentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsSubjectCommentServiceImpl implements CmsSubjectCommentService{

    @Resource
    private CmsSubjectCommentMapper cmsSubjectCommentMapper;

}
