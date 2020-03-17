package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsBaseAttrInfoService;
import com.atguigu.gmall.user.mapper.PmsBaseAttrInfoMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsBaseAttrInfoServiceImpl implements PmsBaseAttrInfoService{

    @Resource
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

}
