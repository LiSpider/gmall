package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.OmsOrderReturnReason;
public interface OmsOrderReturnReasonService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnReason record);

    int insertSelective(OmsOrderReturnReason record);

    OmsOrderReturnReason selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    int updateByPrimaryKey(OmsOrderReturnReason record);

}
