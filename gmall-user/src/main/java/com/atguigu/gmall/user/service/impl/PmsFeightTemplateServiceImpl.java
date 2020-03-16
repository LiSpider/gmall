package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsFeightTemplateService;
import com.atguigu.gmall.user.mapper.PmsFeightTemplateMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsFeightTemplateServiceImpl implements PmsFeightTemplateService{

    @Resource
    private PmsFeightTemplateMapper pmsFeightTemplateMapper;

}
