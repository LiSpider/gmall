package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.OmsOrderItem;
public interface OmsOrderItemService{


    int deleteByPrimaryKey(Integer id);

    int insert(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);

}
