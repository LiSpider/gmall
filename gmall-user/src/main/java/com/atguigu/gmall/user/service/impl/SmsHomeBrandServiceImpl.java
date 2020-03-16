package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.SmsHomeBrand;
import com.atguigu.gmall.user.mapper.SmsHomeBrandMapper;
import com.atguigu.gmall.user.service.SmsHomeBrandService;
@Service
public class SmsHomeBrandServiceImpl implements SmsHomeBrandService{

    @Resource
    private SmsHomeBrandMapper smsHomeBrandMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeBrand record) {
        return smsHomeBrandMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsHomeBrand record) {
        return smsHomeBrandMapper.insertSelective(record);
    }

    @Override
    public SmsHomeBrand selectByPrimaryKey(Long id) {
        return smsHomeBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeBrand record) {
        return smsHomeBrandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeBrand record) {
        return smsHomeBrandMapper.updateByPrimaryKey(record);
    }

}
