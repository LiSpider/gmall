package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.SmsHomeAdvertise;
public interface SmsHomeAdvertiseService{


    int deleteByPrimaryKey(Integer id);

    int insert(SmsHomeAdvertise record);

    int insertSelective(SmsHomeAdvertise record);

    SmsHomeAdvertise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    int updateByPrimaryKey(SmsHomeAdvertise record);

}
