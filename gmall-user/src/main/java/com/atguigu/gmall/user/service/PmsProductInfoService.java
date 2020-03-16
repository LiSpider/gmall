package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsProductInfo;
public interface PmsProductInfoService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductInfo record);

    int insertSelective(PmsProductInfo record);

    PmsProductInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductInfo record);

    int updateByPrimaryKey(PmsProductInfo record);

}
