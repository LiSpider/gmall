package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsBaseSaleAttr;
import com.atguigu.gmall.user.mapper.PmsBaseSaleAttrMapper;
import com.atguigu.gmall.user.service.PmsBaseSaleAttrService;
@Service
public class PmsBaseSaleAttrServiceImpl implements PmsBaseSaleAttrService{

    @Resource
    private PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsBaseSaleAttrMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsBaseSaleAttr record) {
        return pmsBaseSaleAttrMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsBaseSaleAttr record) {
        return pmsBaseSaleAttrMapper.insertSelective(record);
    }

    @Override
    public PmsBaseSaleAttr selectByPrimaryKey(Long id) {
        return pmsBaseSaleAttrMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBaseSaleAttr record) {
        return pmsBaseSaleAttrMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsBaseSaleAttr record) {
        return pmsBaseSaleAttrMapper.updateByPrimaryKey(record);
    }

}
