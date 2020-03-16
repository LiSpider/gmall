package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsPrefrenceAreaProductRelationService;
import com.atguigu.gmall.user.mapper.CmsPrefrenceAreaProductRelationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsPrefrenceAreaProductRelationServiceImpl implements CmsPrefrenceAreaProductRelationService{

    @Resource
    private CmsPrefrenceAreaProductRelationMapper cmsPrefrenceAreaProductRelationMapper;

}
