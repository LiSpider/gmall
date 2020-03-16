package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMemberProductCategoryRelation;
public interface UmsMemberProductCategoryRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberProductCategoryRelation record);

    int insertSelective(UmsMemberProductCategoryRelation record);

    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record);

    int updateByPrimaryKey(UmsMemberProductCategoryRelation record);

}
