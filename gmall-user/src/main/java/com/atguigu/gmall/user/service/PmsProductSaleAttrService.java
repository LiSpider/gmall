package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsProductSaleAttr;
public interface PmsProductSaleAttrService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductSaleAttr record);

    int insertSelective(PmsProductSaleAttr record);

    PmsProductSaleAttr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductSaleAttr record);

    int updateByPrimaryKey(PmsProductSaleAttr record);

}
