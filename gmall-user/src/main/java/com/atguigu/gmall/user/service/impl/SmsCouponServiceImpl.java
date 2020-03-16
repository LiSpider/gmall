package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.SmsCouponMapper;
import com.atguigu.gmall.user.bean.SmsCoupon;
import com.atguigu.gmall.user.service.SmsCouponService;
@Service
public class SmsCouponServiceImpl implements SmsCouponService{

    @Resource
    private SmsCouponMapper smsCouponMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsCouponMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsCoupon record) {
        return smsCouponMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsCoupon record) {
        return smsCouponMapper.insertSelective(record);
    }

    @Override
    public SmsCoupon selectByPrimaryKey(Long id) {
        return smsCouponMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsCoupon record) {
        return smsCouponMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsCoupon record) {
        return smsCouponMapper.updateByPrimaryKey(record);
    }

}
