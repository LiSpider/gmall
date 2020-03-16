package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsAdminPermissionRelation;
public interface UmsAdminPermissionRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermissionRelation record);

    int insertSelective(UmsAdminPermissionRelation record);

    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    int updateByPrimaryKey(UmsAdminPermissionRelation record);

}
