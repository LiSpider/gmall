package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsSkuAttrValueService;
import com.atguigu.gmall.user.mapper.PmsSkuAttrValueMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsSkuAttrValueServiceImpl implements PmsSkuAttrValueService{

    @Resource
    private PmsSkuAttrValueMapper pmsSkuAttrValueMapper;

}
