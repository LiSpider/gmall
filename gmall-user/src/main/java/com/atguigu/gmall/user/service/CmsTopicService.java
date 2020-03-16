package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsTopic;
public interface CmsTopicService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsTopic record);

    int insertSelective(CmsTopic record);

    CmsTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopic record);

    int updateByPrimaryKey(CmsTopic record);

}
