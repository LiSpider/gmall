package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.WmsWareOrderTaskDetailService;
import com.atguigu.gmall.user.mapper.WmsWareOrderTaskDetailMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WmsWareOrderTaskDetailServiceImpl implements WmsWareOrderTaskDetailService{

    @Resource
    private WmsWareOrderTaskDetailMapper wmsWareOrderTaskDetailMapper;

}
