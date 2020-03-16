package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsPrefrenceAreaService;
import com.atguigu.gmall.user.mapper.CmsPrefrenceAreaMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService{

    @Resource
    private CmsPrefrenceAreaMapper cmsPrefrenceAreaMapper;

}
