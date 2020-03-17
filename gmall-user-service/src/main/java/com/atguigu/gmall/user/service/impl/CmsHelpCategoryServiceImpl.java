package com.atguigu.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.service.CmsHelpCategoryService;
import com.atguigu.gmall.user.mapper.CmsHelpCategoryMapper;

import javax.annotation.Resource;

@Service
public class CmsHelpCategoryServiceImpl implements CmsHelpCategoryService{

    @Resource
    private CmsHelpCategoryMapper cmsHelpCategoryMapper;

}
