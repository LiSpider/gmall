package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMemberLoginLog;
public interface UmsMemberLoginLogService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLoginLog record);

    int insertSelective(UmsMemberLoginLog record);

    UmsMemberLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    int updateByPrimaryKey(UmsMemberLoginLog record);

}
