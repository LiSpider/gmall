package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsCouponProductRelation;
public interface SmsCouponProductRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductRelation record);

    int insertSelective(SmsCouponProductRelation record);

    SmsCouponProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponProductRelation record);

    int updateByPrimaryKey(SmsCouponProductRelation record);

}
