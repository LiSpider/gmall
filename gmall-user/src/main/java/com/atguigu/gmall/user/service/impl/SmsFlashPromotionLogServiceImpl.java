package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.SmsFlashPromotionLogMapper;
import com.atguigu.gmall.user.bean.SmsFlashPromotionLog;
import com.atguigu.gmall.user.service.SmsFlashPromotionLogService;
@Service
public class SmsFlashPromotionLogServiceImpl implements SmsFlashPromotionLogService{

    @Resource
    private SmsFlashPromotionLogMapper smsFlashPromotionLogMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return smsFlashPromotionLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.insertSelective(record);
    }

    @Override
    public SmsFlashPromotionLog selectByPrimaryKey(Integer id) {
        return smsFlashPromotionLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsFlashPromotionLog record) {
        return smsFlashPromotionLogMapper.updateByPrimaryKey(record);
    }

}
