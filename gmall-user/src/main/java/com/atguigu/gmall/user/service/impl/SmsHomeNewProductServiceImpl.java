package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.SmsHomeNewProduct;
import com.atguigu.gmall.user.mapper.SmsHomeNewProductMapper;
import com.atguigu.gmall.user.service.SmsHomeNewProductService;
@Service
public class SmsHomeNewProductServiceImpl implements SmsHomeNewProductService{

    @Resource
    private SmsHomeNewProductMapper smsHomeNewProductMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeNewProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.insertSelective(record);
    }

    @Override
    public SmsHomeNewProduct selectByPrimaryKey(Long id) {
        return smsHomeNewProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeNewProduct record) {
        return smsHomeNewProductMapper.updateByPrimaryKey(record);
    }

}
