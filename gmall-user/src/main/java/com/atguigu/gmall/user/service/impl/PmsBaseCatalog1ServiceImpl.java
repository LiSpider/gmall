package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsBaseCatalog1Service;
import com.atguigu.gmall.user.mapper.PmsBaseCatalog1Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsBaseCatalog1ServiceImpl implements PmsBaseCatalog1Service{

    @Resource
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

}
