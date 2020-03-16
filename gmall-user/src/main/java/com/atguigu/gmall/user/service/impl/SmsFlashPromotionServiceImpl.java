package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.SmsFlashPromotionMapper;
import com.atguigu.gmall.user.bean.SmsFlashPromotion;
import com.atguigu.gmall.user.service.SmsFlashPromotionService;
@Service
public class SmsFlashPromotionServiceImpl implements SmsFlashPromotionService{

    @Resource
    private SmsFlashPromotionMapper smsFlashPromotionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsFlashPromotionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.insertSelective(record);
    }

    @Override
    public SmsFlashPromotion selectByPrimaryKey(Long id) {
        return smsFlashPromotionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsFlashPromotion record) {
        return smsFlashPromotionMapper.updateByPrimaryKey(record);
    }

}
