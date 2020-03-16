package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberReceiveAddressService;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService{

    @Resource
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

}
