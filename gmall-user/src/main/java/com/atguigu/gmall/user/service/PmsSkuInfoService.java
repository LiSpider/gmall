package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsSkuInfo;
public interface PmsSkuInfoService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuInfo record);

    int insertSelective(PmsSkuInfo record);

    PmsSkuInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuInfo record);

    int updateByPrimaryKey(PmsSkuInfo record);

}
