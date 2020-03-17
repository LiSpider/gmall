package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsTopicService;
import com.atguigu.gmall.user.mapper.CmsTopicMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class CmsTopicServiceImpl implements CmsTopicService{

    @Resource
    private CmsTopicMapper cmsTopicMapper;

}
