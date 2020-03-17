package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.OmsCompanyAddressService;
import com.atguigu.gmall.user.mapper.OmsCompanyAddressMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService{

    @Resource
    private OmsCompanyAddressMapper omsCompanyAddressMapper;

}
