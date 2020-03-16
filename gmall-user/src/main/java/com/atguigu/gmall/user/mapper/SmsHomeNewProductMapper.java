package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.SmsHomeNewProduct;

public interface SmsHomeNewProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeNewProduct record);

    int insertSelective(SmsHomeNewProduct record);

    SmsHomeNewProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    int updateByPrimaryKey(SmsHomeNewProduct record);
}