package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsSubjectCategoryService;
import com.atguigu.gmall.user.mapper.CmsSubjectCategoryMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class CmsSubjectCategoryServiceImpl implements CmsSubjectCategoryService{

    @Resource
    private CmsSubjectCategoryMapper cmsSubjectCategoryMapper;

}
