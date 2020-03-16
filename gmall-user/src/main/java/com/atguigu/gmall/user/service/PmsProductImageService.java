package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsProductImage;
public interface PmsProductImageService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductImage record);

    int insertSelective(PmsProductImage record);

    PmsProductImage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductImage record);

    int updateByPrimaryKey(PmsProductImage record);

}
