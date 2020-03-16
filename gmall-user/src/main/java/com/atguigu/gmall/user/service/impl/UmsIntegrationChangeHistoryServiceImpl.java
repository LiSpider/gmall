package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UmsIntegrationChangeHistoryService;
import com.atguigu.gmall.user.mapper.UmsIntegrationChangeHistoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService{

    @Resource
    private UmsIntegrationChangeHistoryMapper umsIntegrationChangeHistoryMapper;

}
