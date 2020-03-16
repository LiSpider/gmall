package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsCouponHistory;
public interface SmsCouponHistoryService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponHistory record);

    int insertSelective(SmsCouponHistory record);

    SmsCouponHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponHistory record);

    int updateByPrimaryKey(SmsCouponHistory record);

}
