package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsHelpService;
import com.atguigu.gmall.user.mapper.CmsHelpMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class CmsHelpServiceImpl implements CmsHelpService{

    @Resource
    private CmsHelpMapper cmsHelpMapper;

}
