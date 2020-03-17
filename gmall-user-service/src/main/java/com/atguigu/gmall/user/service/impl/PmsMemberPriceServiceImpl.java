package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsMemberPriceService;
import com.atguigu.gmall.user.mapper.PmsMemberPriceMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsMemberPriceServiceImpl implements PmsMemberPriceService{

    @Resource
    private PmsMemberPriceMapper pmsMemberPriceMapper;

}
