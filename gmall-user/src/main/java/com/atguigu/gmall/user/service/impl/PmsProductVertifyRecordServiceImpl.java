package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductVertifyRecordService;
import com.atguigu.gmall.user.mapper.PmsProductVertifyRecordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsProductVertifyRecordServiceImpl implements PmsProductVertifyRecordService{

    @Resource
    private PmsProductVertifyRecordMapper pmsProductVertifyRecordMapper;

}
