package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.OmsCartItemService;
import com.atguigu.gmall.user.mapper.OmsCartItemMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OmsCartItemServiceImpl implements OmsCartItemService{

    @Resource
    private OmsCartItemMapper omsCartItemMapper;

}
