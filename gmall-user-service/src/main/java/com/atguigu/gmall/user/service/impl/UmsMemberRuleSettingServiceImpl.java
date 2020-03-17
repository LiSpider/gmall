package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsMemberRuleSettingService;
import com.atguigu.gmall.user.mapper.UmsMemberRuleSettingMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberRuleSettingServiceImpl implements UmsMemberRuleSettingService{

    @Resource
    private UmsMemberRuleSettingMapper umsMemberRuleSettingMapper;

}
