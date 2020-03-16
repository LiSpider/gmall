package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.OmsOrderReturnReasonMapper;
import com.atguigu.gmall.user.bean.OmsOrderReturnReason;
import com.atguigu.gmall.user.service.OmsOrderReturnReasonService;
@Service
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService{

    @Resource
    private OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderReturnReasonMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.insertSelective(record);
    }

    @Override
    public OmsOrderReturnReason selectByPrimaryKey(Long id) {
        return omsOrderReturnReasonMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderReturnReason record) {
        return omsOrderReturnReasonMapper.updateByPrimaryKey(record);
    }

}
