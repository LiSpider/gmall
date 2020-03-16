package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsHomeBrand;
public interface SmsHomeBrandService{


    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeBrand record);

    int insertSelective(SmsHomeBrand record);

    SmsHomeBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeBrand record);

    int updateByPrimaryKey(SmsHomeBrand record);

}
