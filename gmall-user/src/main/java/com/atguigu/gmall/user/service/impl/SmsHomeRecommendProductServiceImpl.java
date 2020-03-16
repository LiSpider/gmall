package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.SmsHomeRecommendProductMapper;
import com.atguigu.gmall.user.bean.SmsHomeRecommendProduct;
import com.atguigu.gmall.user.service.SmsHomeRecommendProductService;
@Service
public class SmsHomeRecommendProductServiceImpl implements SmsHomeRecommendProductService{

    @Resource
    private SmsHomeRecommendProductMapper smsHomeRecommendProductMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeRecommendProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.insertSelective(record);
    }

    @Override
    public SmsHomeRecommendProduct selectByPrimaryKey(Long id) {
        return smsHomeRecommendProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeRecommendProduct record) {
        return smsHomeRecommendProductMapper.updateByPrimaryKey(record);
    }

}
