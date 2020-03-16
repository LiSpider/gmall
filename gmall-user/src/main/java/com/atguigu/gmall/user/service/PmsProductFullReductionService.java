package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsProductFullReduction;
public interface PmsProductFullReductionService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductFullReduction record);

    int insertSelective(PmsProductFullReduction record);

    PmsProductFullReduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    int updateByPrimaryKey(PmsProductFullReduction record);

}
