package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.WmsWareOrderTaskDetailService;
import com.atguigu.gmall.user.mapper.WmsWareOrderTaskDetailMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class WmsWareOrderTaskDetailServiceImpl implements WmsWareOrderTaskDetailService{

    @Resource
    private WmsWareOrderTaskDetailMapper wmsWareOrderTaskDetailMapper;

}
