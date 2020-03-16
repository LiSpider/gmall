package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsProductLadder;
public interface PmsProductLadderService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLadder record);

    int insertSelective(PmsProductLadder record);

    PmsProductLadder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductLadder record);

    int updateByPrimaryKey(PmsProductLadder record);

}
