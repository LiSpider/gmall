package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMemberMemberTagRelation;
public interface UmsMemberMemberTagRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberMemberTagRelation record);

    int insertSelective(UmsMemberMemberTagRelation record);

    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    int updateByPrimaryKey(UmsMemberMemberTagRelation record);

}
