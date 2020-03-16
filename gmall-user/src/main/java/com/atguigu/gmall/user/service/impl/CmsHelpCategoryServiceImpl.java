package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsHelpCategoryService;
import com.atguigu.gmall.user.mapper.CmsHelpCategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsHelpCategoryServiceImpl implements CmsHelpCategoryService{

    @Resource
    private CmsHelpCategoryMapper cmsHelpCategoryMapper;

}
