package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.SmsHomeAdvertiseMapper;
import com.atguigu.gmall.user.bean.SmsHomeAdvertise;
import com.atguigu.gmall.user.service.SmsHomeAdvertiseService;
@Service
public class SmsHomeAdvertiseServiceImpl implements SmsHomeAdvertiseService{

    @Resource
    private SmsHomeAdvertiseMapper smsHomeAdvertiseMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return smsHomeAdvertiseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.insertSelective(record);
    }

    @Override
    public SmsHomeAdvertise selectByPrimaryKey(Integer id) {
        return smsHomeAdvertiseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.updateByPrimaryKey(record);
    }

}
