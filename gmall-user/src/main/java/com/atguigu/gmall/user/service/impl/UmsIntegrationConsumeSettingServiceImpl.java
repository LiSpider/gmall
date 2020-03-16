package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsIntegrationConsumeSettingService;
import com.atguigu.gmall.user.mapper.UmsIntegrationConsumeSettingMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsIntegrationConsumeSettingServiceImpl implements UmsIntegrationConsumeSettingService{

    @Resource
    private UmsIntegrationConsumeSettingMapper umsIntegrationConsumeSettingMapper;

}
