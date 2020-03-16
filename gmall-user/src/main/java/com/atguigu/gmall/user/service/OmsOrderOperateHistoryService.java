package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.OmsOrderOperateHistory;
public interface OmsOrderOperateHistoryService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistory record);

    int insertSelective(OmsOrderOperateHistory record);

    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    int updateByPrimaryKey(OmsOrderOperateHistory record);

}
