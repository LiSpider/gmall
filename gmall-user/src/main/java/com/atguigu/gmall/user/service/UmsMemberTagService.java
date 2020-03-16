package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMemberTag;
public interface UmsMemberTagService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag record);

    int insertSelective(UmsMemberTag record);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTag record);

    int updateByPrimaryKey(UmsMemberTag record);

}
