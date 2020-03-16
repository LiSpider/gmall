package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsAdminLoginLog;
public interface UmsAdminLoginLogService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminLoginLog record);

    int insertSelective(UmsAdminLoginLog record);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    int updateByPrimaryKey(UmsAdminLoginLog record);

}
