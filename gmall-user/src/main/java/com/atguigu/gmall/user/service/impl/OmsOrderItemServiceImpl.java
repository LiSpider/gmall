package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.OmsOrderItem;
import com.atguigu.gmall.user.mapper.OmsOrderItemMapper;
import com.atguigu.gmall.user.service.OmsOrderItemService;
@Service
public class OmsOrderItemServiceImpl implements OmsOrderItemService{

    @Resource
    private OmsOrderItemMapper omsOrderItemMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return omsOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderItem record) {
        return omsOrderItemMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsOrderItem record) {
        return omsOrderItemMapper.insertSelective(record);
    }

    @Override
    public OmsOrderItem selectByPrimaryKey(Integer id) {
        return omsOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderItem record) {
        return omsOrderItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderItem record) {
        return omsOrderItemMapper.updateByPrimaryKey(record);
    }

}
