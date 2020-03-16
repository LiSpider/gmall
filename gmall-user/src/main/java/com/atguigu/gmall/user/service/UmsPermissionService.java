package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsPermission;
public interface UmsPermissionService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsPermission record);

    int insertSelective(UmsPermission record);

    UmsPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsPermission record);

    int updateByPrimaryKey(UmsPermission record);

}
