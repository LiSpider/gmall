package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsTopicCategory;
public interface CmsTopicCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicCategory record);

    int insertSelective(CmsTopicCategory record);

    CmsTopicCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicCategory record);

    int updateByPrimaryKey(CmsTopicCategory record);

}
