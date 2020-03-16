package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsCoupon;
public interface SmsCouponService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsCoupon record);

    int insertSelective(SmsCoupon record);

    SmsCoupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCoupon record);

    int updateByPrimaryKey(SmsCoupon record);

}
