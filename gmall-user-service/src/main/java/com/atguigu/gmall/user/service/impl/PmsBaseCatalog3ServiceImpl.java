package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsBaseCatalog3Service;
import com.atguigu.gmall.user.mapper.PmsBaseCatalog3Mapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsBaseCatalog3ServiceImpl implements PmsBaseCatalog3Service{

    @Resource
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

}
