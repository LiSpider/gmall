package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberMemberTagRelationService;
import com.atguigu.gmall.user.mapper.UmsMemberMemberTagRelationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberMemberTagRelationServiceImpl implements UmsMemberMemberTagRelationService{

    @Resource
    private UmsMemberMemberTagRelationMapper umsMemberMemberTagRelationMapper;

}
