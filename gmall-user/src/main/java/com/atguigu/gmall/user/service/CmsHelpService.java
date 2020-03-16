package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsHelp;
public interface CmsHelpService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsHelp record);

    int insertSelective(CmsHelp record);

    CmsHelp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelp record);

    int updateByPrimaryKey(CmsHelp record);

}
