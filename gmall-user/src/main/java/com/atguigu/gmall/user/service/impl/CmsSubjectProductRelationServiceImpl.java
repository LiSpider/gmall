package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsSubjectProductRelationService;
import com.atguigu.gmall.user.mapper.CmsSubjectProductRelationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsSubjectProductRelationServiceImpl implements CmsSubjectProductRelationService{

    @Resource
    private CmsSubjectProductRelationMapper cmsSubjectProductRelationMapper;

}
