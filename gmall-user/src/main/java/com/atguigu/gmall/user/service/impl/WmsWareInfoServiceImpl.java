package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.WmsWareInfoService;
import com.atguigu.gmall.user.mapper.WmsWareInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WmsWareInfoServiceImpl implements WmsWareInfoService{

    @Resource
    private WmsWareInfoMapper wmsWareInfoMapper;

}
