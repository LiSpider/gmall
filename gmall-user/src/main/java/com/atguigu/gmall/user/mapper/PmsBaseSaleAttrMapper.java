package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.PmsBaseSaleAttr;

public interface PmsBaseSaleAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseSaleAttr record);

    int insertSelective(PmsBaseSaleAttr record);

    PmsBaseSaleAttr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBaseSaleAttr record);

    int updateByPrimaryKey(PmsBaseSaleAttr record);
}