package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.PaymentInfoMapper;
import com.atguigu.gmall.user.bean.PaymentInfo;
import com.atguigu.gmall.user.service.PaymentInfoService;
@Service
public class PaymentInfoServiceImpl implements PaymentInfoService{

    @Resource
    private PaymentInfoMapper paymentInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return paymentInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PaymentInfo record) {
        return paymentInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PaymentInfo record) {
        return paymentInfoMapper.insertSelective(record);
    }

    @Override
    public PaymentInfo selectByPrimaryKey(Long id) {
        return paymentInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PaymentInfo record) {
        return paymentInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PaymentInfo record) {
        return paymentInfoMapper.updateByPrimaryKey(record);
    }

}
