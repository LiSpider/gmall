package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.PmsCommentReplayService;
import com.atguigu.gmall.user.mapper.PmsCommentReplayMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService{

    @Resource
    private PmsCommentReplayMapper pmsCommentReplayMapper;

}
