package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.SmsCouponHistory;
import com.atguigu.gmall.user.mapper.SmsCouponHistoryMapper;
import com.atguigu.gmall.user.service.SmsCouponHistoryService;
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService{

    @Resource
    private SmsCouponHistoryMapper smsCouponHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsCouponHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsCouponHistory record) {
        return smsCouponHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsCouponHistory record) {
        return smsCouponHistoryMapper.insertSelective(record);
    }

    @Override
    public SmsCouponHistory selectByPrimaryKey(Long id) {
        return smsCouponHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsCouponHistory record) {
        return smsCouponHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsCouponHistory record) {
        return smsCouponHistoryMapper.updateByPrimaryKey(record);
    }

}
