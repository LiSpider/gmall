package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.OmsOrderMapper;
import com.atguigu.gmall.user.bean.OmsOrder;
import com.atguigu.gmall.user.service.OmsOrderService;
@Service
public class OmsOrderServiceImpl implements OmsOrderService{

    @Resource
    private OmsOrderMapper omsOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrder record) {
        return omsOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsOrder record) {
        return omsOrderMapper.insertSelective(record);
    }

    @Override
    public OmsOrder selectByPrimaryKey(Long id) {
        return omsOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrder record) {
        return omsOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrder record) {
        return omsOrderMapper.updateByPrimaryKey(record);
    }

}
