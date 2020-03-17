package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsTopicCategoryService;
import com.atguigu.gmall.user.mapper.CmsTopicCategoryMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class CmsTopicCategoryServiceImpl implements CmsTopicCategoryService{

    @Resource
    private CmsTopicCategoryMapper cmsTopicCategoryMapper;

}
