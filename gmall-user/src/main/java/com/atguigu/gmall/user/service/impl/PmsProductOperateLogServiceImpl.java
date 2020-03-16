package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsProductOperateLogService;
import com.atguigu.gmall.user.mapper.PmsProductOperateLogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsProductOperateLogServiceImpl implements PmsProductOperateLogService{

    @Resource
    private PmsProductOperateLogMapper pmsProductOperateLogMapper;

}
