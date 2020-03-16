package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsSubject;
public interface CmsSubjectService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsSubject record);

    int insertSelective(CmsSubject record);

    CmsSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubject record);

    int updateByPrimaryKey(CmsSubject record);

}
