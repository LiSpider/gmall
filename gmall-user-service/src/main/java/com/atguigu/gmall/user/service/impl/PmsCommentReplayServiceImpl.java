package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsCommentReplayService;
import com.atguigu.gmall.user.mapper.PmsCommentReplayMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService{

    @Resource
    private PmsCommentReplayMapper pmsCommentReplayMapper;

}
