package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductSaleAttrValueService;
import com.atguigu.gmall.user.mapper.PmsProductSaleAttrValueMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsProductSaleAttrValueServiceImpl implements PmsProductSaleAttrValueService{

    @Resource
    private PmsProductSaleAttrValueMapper pmsProductSaleAttrValueMapper;

}
