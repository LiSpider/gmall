package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsTopicCommentService;
import com.atguigu.gmall.user.mapper.CmsTopicCommentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsTopicCommentServiceImpl implements CmsTopicCommentService{

    @Resource
    private CmsTopicCommentMapper cmsTopicCommentMapper;

}
