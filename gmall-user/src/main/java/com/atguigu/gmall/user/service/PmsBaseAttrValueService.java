package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsBaseAttrValue;
public interface PmsBaseAttrValueService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrValue record);

    int insertSelective(PmsBaseAttrValue record);

    PmsBaseAttrValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBaseAttrValue record);

    int updateByPrimaryKey(PmsBaseAttrValue record);

}
