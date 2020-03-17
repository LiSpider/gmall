package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.CmsMemberReportService;
import com.atguigu.gmall.user.mapper.CmsMemberReportMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class CmsMemberReportServiceImpl implements CmsMemberReportService{

    @Resource
    private CmsMemberReportMapper cmsMemberReportMapper;

}
