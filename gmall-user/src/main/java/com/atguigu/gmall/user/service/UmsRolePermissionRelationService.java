package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsRolePermissionRelation;
public interface UmsRolePermissionRelationService{


    int deleteByPrimaryKey(Integer id);

    int insert(UmsRolePermissionRelation record);

    int insertSelective(UmsRolePermissionRelation record);

    UmsRolePermissionRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UmsRolePermissionRelation record);

    int updateByPrimaryKey(UmsRolePermissionRelation record);

}
