package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsCouponService;
import com.atguigu.gmall.user.mapper.SmsCouponMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsCouponServiceImpl implements SmsCouponService{

    @Resource
    private SmsCouponMapper smsCouponMapper;

}
