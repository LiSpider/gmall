package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsHelpService;
import com.atguigu.gmall.user.mapper.CmsHelpMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsHelpServiceImpl implements CmsHelpService{

    @Resource
    private CmsHelpMapper cmsHelpMapper;

}
