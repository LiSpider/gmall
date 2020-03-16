package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsSubjectService;
import com.atguigu.gmall.user.mapper.CmsSubjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsSubjectServiceImpl implements CmsSubjectService{

    @Resource
    private CmsSubjectMapper cmsSubjectMapper;

}
