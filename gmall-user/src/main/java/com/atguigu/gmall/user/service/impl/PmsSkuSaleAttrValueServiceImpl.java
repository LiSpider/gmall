package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsSkuSaleAttrValueService;
import com.atguigu.gmall.user.mapper.PmsSkuSaleAttrValueMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsSkuSaleAttrValueServiceImpl implements PmsSkuSaleAttrValueService{

    @Resource
    private PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;

}
