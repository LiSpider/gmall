package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.WmsWareOrderTaskService;
import com.atguigu.gmall.user.mapper.WmsWareOrderTaskMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WmsWareOrderTaskServiceImpl implements WmsWareOrderTaskService{

    @Resource
    private WmsWareOrderTaskMapper wmsWareOrderTaskMapper;

}
