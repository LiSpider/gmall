package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductImageService;
import com.atguigu.gmall.user.mapper.PmsProductImageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsProductImageServiceImpl implements PmsProductImageService{

    @Resource
    private PmsProductImageMapper pmsProductImageMapper;

}
