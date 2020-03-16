package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.OmsCartItem;
public interface OmsCartItemService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsCartItem record);

    int insertSelective(OmsCartItem record);

    OmsCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsCartItem record);

    int updateByPrimaryKey(OmsCartItem record);

}
