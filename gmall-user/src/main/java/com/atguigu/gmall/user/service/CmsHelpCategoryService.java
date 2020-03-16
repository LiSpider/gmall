package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsHelpCategory;
public interface CmsHelpCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategory record);

    int insertSelective(CmsHelpCategory record);

    CmsHelpCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelpCategory record);

    int updateByPrimaryKey(CmsHelpCategory record);

}
