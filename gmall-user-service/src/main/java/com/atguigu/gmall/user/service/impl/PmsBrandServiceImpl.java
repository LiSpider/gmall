package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsBrandService;
import com.atguigu.gmall.user.mapper.PmsBrandMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsBrandServiceImpl implements PmsBrandService{

    @Resource
    private PmsBrandMapper pmsBrandMapper;

}
