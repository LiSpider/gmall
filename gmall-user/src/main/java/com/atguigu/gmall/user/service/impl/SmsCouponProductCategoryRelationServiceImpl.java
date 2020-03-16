package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.SmsCouponProductCategoryRelation;
import com.atguigu.gmall.user.mapper.SmsCouponProductCategoryRelationMapper;
import com.atguigu.gmall.user.service.SmsCouponProductCategoryRelationService;
@Service
public class SmsCouponProductCategoryRelationServiceImpl implements SmsCouponProductCategoryRelationService{

    @Resource
    private SmsCouponProductCategoryRelationMapper smsCouponProductCategoryRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsCouponProductCategoryRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.insertSelective(record);
    }

    @Override
    public SmsCouponProductCategoryRelation selectByPrimaryKey(Long id) {
        return smsCouponProductCategoryRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsCouponProductCategoryRelation record) {
        return smsCouponProductCategoryRelationMapper.updateByPrimaryKey(record);
    }

}
