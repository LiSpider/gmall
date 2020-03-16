package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.SmsCouponProductRelationMapper;
import com.atguigu.gmall.user.bean.SmsCouponProductRelation;
import com.atguigu.gmall.user.service.SmsCouponProductRelationService;
@Service
public class SmsCouponProductRelationServiceImpl implements SmsCouponProductRelationService{

    @Resource
    private SmsCouponProductRelationMapper smsCouponProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsCouponProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.insertSelective(record);
    }

    @Override
    public SmsCouponProductRelation selectByPrimaryKey(Long id) {
        return smsCouponProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsCouponProductRelation record) {
        return smsCouponProductRelationMapper.updateByPrimaryKey(record);
    }

}
