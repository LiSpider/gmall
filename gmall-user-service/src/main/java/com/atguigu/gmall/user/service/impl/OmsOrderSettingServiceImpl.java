package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.OmsOrderSettingService;
import com.atguigu.gmall.user.mapper.OmsOrderSettingMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService{

    @Resource
    private OmsOrderSettingMapper omsOrderSettingMapper;

}
