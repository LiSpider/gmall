package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.PmsSkuSaleAttrValue;

public interface PmsSkuSaleAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuSaleAttrValue record);

    int insertSelective(PmsSkuSaleAttrValue record);

    PmsSkuSaleAttrValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuSaleAttrValue record);

    int updateByPrimaryKey(PmsSkuSaleAttrValue record);
}