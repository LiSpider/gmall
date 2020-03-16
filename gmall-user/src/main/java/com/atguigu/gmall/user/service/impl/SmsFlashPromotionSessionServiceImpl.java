package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.SmsFlashPromotionSessionMapper;
import com.atguigu.gmall.user.bean.SmsFlashPromotionSession;
import com.atguigu.gmall.user.service.SmsFlashPromotionSessionService;
@Service
public class SmsFlashPromotionSessionServiceImpl implements SmsFlashPromotionSessionService{

    @Resource
    private SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsFlashPromotionSessionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.insertSelective(record);
    }

    @Override
    public SmsFlashPromotionSession selectByPrimaryKey(Long id) {
        return smsFlashPromotionSessionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsFlashPromotionSession record) {
        return smsFlashPromotionSessionMapper.updateByPrimaryKey(record);
    }

}
