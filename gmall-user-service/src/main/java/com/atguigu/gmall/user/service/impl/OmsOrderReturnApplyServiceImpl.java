package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.OmsOrderReturnApplyService;
import com.atguigu.gmall.user.mapper.OmsOrderReturnApplyMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService{

    @Resource
    private OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;

}
