package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsSubjectCategoryService;
import com.atguigu.gmall.user.mapper.CmsSubjectCategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsSubjectCategoryServiceImpl implements CmsSubjectCategoryService{

    @Resource
    private CmsSubjectCategoryMapper cmsSubjectCategoryMapper;

}
