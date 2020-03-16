package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsPrefrenceArea;
public interface CmsPrefrenceAreaService{


    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceArea record);

    int insertSelective(CmsPrefrenceArea record);

    CmsPrefrenceArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    int updateByPrimaryKey(CmsPrefrenceArea record);

}
