package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsProductVertifyRecord;
public interface PmsProductVertifyRecordService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductVertifyRecord record);

    int insertSelective(PmsProductVertifyRecord record);

    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductVertifyRecord record);

    int updateByPrimaryKey(PmsProductVertifyRecord record);

}
