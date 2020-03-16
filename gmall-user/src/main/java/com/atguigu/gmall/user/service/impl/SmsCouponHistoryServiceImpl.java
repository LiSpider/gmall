package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsCouponHistoryService;
import com.atguigu.gmall.user.mapper.SmsCouponHistoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService{

    @Resource
    private SmsCouponHistoryMapper smsCouponHistoryMapper;

}
