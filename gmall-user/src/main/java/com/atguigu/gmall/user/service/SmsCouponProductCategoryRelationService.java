package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsCouponProductCategoryRelation;
public interface SmsCouponProductCategoryRelationService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductCategoryRelation record);

    int insertSelective(SmsCouponProductCategoryRelation record);

    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record);

    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);

}
