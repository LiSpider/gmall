package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsSubjectComment;
public interface CmsSubjectCommentService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectComment record);

    int insertSelective(CmsSubjectComment record);

    CmsSubjectComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectComment record);

    int updateByPrimaryKey(CmsSubjectComment record);

}
