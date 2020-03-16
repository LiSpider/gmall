package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMemberLevel;
public interface UmsMemberLevelService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);

}
