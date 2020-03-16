package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.SmsHomeRecommendSubjectService;
import com.atguigu.gmall.user.mapper.SmsHomeRecommendSubjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SmsHomeRecommendSubjectServiceImpl implements SmsHomeRecommendSubjectService{

    @Resource
    private SmsHomeRecommendSubjectMapper smsHomeRecommendSubjectMapper;

}
