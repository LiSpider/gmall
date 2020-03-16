package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsSubjectProductRelation;
public interface CmsSubjectProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectProductRelation record);

    int insertSelective(CmsSubjectProductRelation record);

    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectProductRelation record);

    int updateByPrimaryKey(CmsSubjectProductRelation record);

}
