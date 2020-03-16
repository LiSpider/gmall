package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.SmsFlashPromotionProductRelationMapper;
import com.atguigu.gmall.user.bean.SmsFlashPromotionProductRelation;
import com.atguigu.gmall.user.service.SmsFlashPromotionProductRelationService;
@Service
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService{

    @Resource
    private SmsFlashPromotionProductRelationMapper smsFlashPromotionProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsFlashPromotionProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.insertSelective(record);
    }

    @Override
    public SmsFlashPromotionProductRelation selectByPrimaryKey(Long id) {
        return smsFlashPromotionProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsFlashPromotionProductRelation record) {
        return smsFlashPromotionProductRelationMapper.updateByPrimaryKey(record);
    }

}
