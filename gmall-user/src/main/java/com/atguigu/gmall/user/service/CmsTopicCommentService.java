package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsTopicComment;
public interface CmsTopicCommentService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicComment record);

    int insertSelective(CmsTopicComment record);

    CmsTopicComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicComment record);

    int updateByPrimaryKey(CmsTopicComment record);

}
