package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.PmsBaseAttrValue;

public interface PmsBaseAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrValue record);

    int insertSelective(PmsBaseAttrValue record);

    PmsBaseAttrValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBaseAttrValue record);

    int updateByPrimaryKey(PmsBaseAttrValue record);
}