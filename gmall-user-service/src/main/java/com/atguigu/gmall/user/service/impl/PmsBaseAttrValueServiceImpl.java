package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsBaseAttrValueService;
import com.atguigu.gmall.user.mapper.PmsBaseAttrValueMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsBaseAttrValueServiceImpl implements PmsBaseAttrValueService{

    @Resource
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

}
