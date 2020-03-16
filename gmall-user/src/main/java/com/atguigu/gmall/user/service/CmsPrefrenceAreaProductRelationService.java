package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsPrefrenceAreaProductRelation;
public interface CmsPrefrenceAreaProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelation record);

    int insertSelective(CmsPrefrenceAreaProductRelation record);

    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);

}
