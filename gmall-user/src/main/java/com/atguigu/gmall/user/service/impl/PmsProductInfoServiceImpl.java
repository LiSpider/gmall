package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductInfoService;
import com.atguigu.gmall.user.mapper.PmsProductInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsProductInfoServiceImpl implements PmsProductInfoService{

    @Resource
    private PmsProductInfoMapper pmsProductInfoMapper;

}
