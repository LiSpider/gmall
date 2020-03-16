package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.OmsOrderOperateHistory;
import com.atguigu.gmall.user.mapper.OmsOrderOperateHistoryMapper;
import com.atguigu.gmall.user.service.OmsOrderOperateHistoryService;
@Service
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService{

    @Resource
    private OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderOperateHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.insertSelective(record);
    }

    @Override
    public OmsOrderOperateHistory selectByPrimaryKey(Long id) {
        return omsOrderOperateHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderOperateHistory record) {
        return omsOrderOperateHistoryMapper.updateByPrimaryKey(record);
    }

}
