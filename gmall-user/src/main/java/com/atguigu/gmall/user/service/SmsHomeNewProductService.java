package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsHomeNewProduct;
public interface SmsHomeNewProductService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeNewProduct record);

    int insertSelective(SmsHomeNewProduct record);

    SmsHomeNewProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    int updateByPrimaryKey(SmsHomeNewProduct record);

}
