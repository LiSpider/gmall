package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsAdminRoleRelation;
public interface UmsAdminRoleRelationService{


    int deleteByPrimaryKey(Integer id);

    int insert(UmsAdminRoleRelation record);

    int insertSelective(UmsAdminRoleRelation record);

    UmsAdminRoleRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    int updateByPrimaryKey(UmsAdminRoleRelation record);

}
