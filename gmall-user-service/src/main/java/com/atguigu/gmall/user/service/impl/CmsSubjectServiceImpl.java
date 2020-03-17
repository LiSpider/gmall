package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsSubjectService;
import com.atguigu.gmall.user.mapper.CmsSubjectMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class CmsSubjectServiceImpl implements CmsSubjectService{

    @Resource
    private CmsSubjectMapper cmsSubjectMapper;

}
