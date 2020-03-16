package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.WmsWareSkuService;
import com.atguigu.gmall.user.mapper.WmsWareSkuMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WmsWareSkuServiceImpl implements WmsWareSkuService{

    @Resource
    private WmsWareSkuMapper wmsWareSkuMapper;

}
