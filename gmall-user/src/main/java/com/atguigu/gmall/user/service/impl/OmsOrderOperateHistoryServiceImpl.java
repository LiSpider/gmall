package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.OmsOrderOperateHistoryService;
import com.atguigu.gmall.user.mapper.OmsOrderOperateHistoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService{

    @Resource
    private OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

}
