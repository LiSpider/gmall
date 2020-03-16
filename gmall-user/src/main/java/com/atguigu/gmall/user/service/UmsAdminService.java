package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsAdmin;
public interface UmsAdminService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

}
