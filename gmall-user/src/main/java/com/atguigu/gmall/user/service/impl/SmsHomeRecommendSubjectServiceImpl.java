package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.SmsHomeRecommendSubject;
import com.atguigu.gmall.user.mapper.SmsHomeRecommendSubjectMapper;
import com.atguigu.gmall.user.service.SmsHomeRecommendSubjectService;
@Service
public class SmsHomeRecommendSubjectServiceImpl implements SmsHomeRecommendSubjectService{

    @Resource
    private SmsHomeRecommendSubjectMapper smsHomeRecommendSubjectMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeRecommendSubjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.insertSelective(record);
    }

    @Override
    public SmsHomeRecommendSubject selectByPrimaryKey(Long id) {
        return smsHomeRecommendSubjectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeRecommendSubject record) {
        return smsHomeRecommendSubjectMapper.updateByPrimaryKey(record);
    }

}
