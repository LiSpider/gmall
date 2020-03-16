package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsTopicCategoryService;
import com.atguigu.gmall.user.mapper.CmsTopicCategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsTopicCategoryServiceImpl implements CmsTopicCategoryService{

    @Resource
    private CmsTopicCategoryMapper cmsTopicCategoryMapper;

}
