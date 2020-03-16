package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsSubjectCategory;
public interface CmsSubjectCategoryService{


    int deleteByPrimaryKey(Integer id);

    int insert(CmsSubjectCategory record);

    int insertSelective(CmsSubjectCategory record);

    CmsSubjectCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    int updateByPrimaryKey(CmsSubjectCategory record);

}
