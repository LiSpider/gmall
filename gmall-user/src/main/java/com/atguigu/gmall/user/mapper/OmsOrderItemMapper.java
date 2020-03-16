package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.OmsOrderItem;

public interface OmsOrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);
}