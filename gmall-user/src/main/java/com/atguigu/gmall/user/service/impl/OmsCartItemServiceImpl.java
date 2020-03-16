package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.OmsCartItem;
import com.atguigu.gmall.user.mapper.OmsCartItemMapper;
import com.atguigu.gmall.user.service.OmsCartItemService;
@Service
public class OmsCartItemServiceImpl implements OmsCartItemService{

    @Resource
    private OmsCartItemMapper omsCartItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsCartItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsCartItem record) {
        return omsCartItemMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsCartItem record) {
        return omsCartItemMapper.insertSelective(record);
    }

    @Override
    public OmsCartItem selectByPrimaryKey(Long id) {
        return omsCartItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsCartItem record) {
        return omsCartItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsCartItem record) {
        return omsCartItemMapper.updateByPrimaryKey(record);
    }

}
