package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.OmsOrder;
public interface OmsOrderService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

}
