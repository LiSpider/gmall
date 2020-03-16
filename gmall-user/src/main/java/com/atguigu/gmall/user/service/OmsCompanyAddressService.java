package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.OmsCompanyAddress;
public interface OmsCompanyAddressService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsCompanyAddress record);

    int insertSelective(OmsCompanyAddress record);

    OmsCompanyAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsCompanyAddress record);

    int updateByPrimaryKey(OmsCompanyAddress record);

}
