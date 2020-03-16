package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsRole;
public interface UmsRoleService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsRole record);

    int insertSelective(UmsRole record);

    UmsRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRole record);

    int updateByPrimaryKey(UmsRole record);

}
