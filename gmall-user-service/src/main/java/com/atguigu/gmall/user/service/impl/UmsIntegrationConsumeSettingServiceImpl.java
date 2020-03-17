package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsIntegrationConsumeSettingService;
import com.atguigu.gmall.user.mapper.UmsIntegrationConsumeSettingMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsIntegrationConsumeSettingServiceImpl implements UmsIntegrationConsumeSettingService{

    @Resource
    private UmsIntegrationConsumeSettingMapper umsIntegrationConsumeSettingMapper;

}
