package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsProductOperateLog;
public interface PmsProductOperateLogService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductOperateLog record);

    int insertSelective(PmsProductOperateLog record);

    PmsProductOperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductOperateLog record);

    int updateByPrimaryKey(PmsProductOperateLog record);

}
