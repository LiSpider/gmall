package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsBaseCatalog2Service;
import com.atguigu.gmall.user.mapper.PmsBaseCatalog2Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsBaseCatalog2ServiceImpl implements PmsBaseCatalog2Service{

    @Resource
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

}
