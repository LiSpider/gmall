package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.PmsSkuAttrValue;

public interface PmsSkuAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuAttrValue record);

    int insertSelective(PmsSkuAttrValue record);

    PmsSkuAttrValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuAttrValue record);

    int updateByPrimaryKey(PmsSkuAttrValue record);
}