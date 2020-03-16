package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PaymentInfo;
public interface PaymentInfoService{


    int deleteByPrimaryKey(Long id);

    int insert(PaymentInfo record);

    int insertSelective(PaymentInfo record);

    PaymentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PaymentInfo record);

    int updateByPrimaryKey(PaymentInfo record);

}
