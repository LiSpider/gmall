package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsProductSaleAttr;
import com.atguigu.gmall.user.mapper.PmsProductSaleAttrMapper;
import com.atguigu.gmall.user.service.PmsProductSaleAttrService;
@Service
public class PmsProductSaleAttrServiceImpl implements PmsProductSaleAttrService{

    @Resource
    private PmsProductSaleAttrMapper pmsProductSaleAttrMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductSaleAttrMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductSaleAttr record) {
        return pmsProductSaleAttrMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductSaleAttr record) {
        return pmsProductSaleAttrMapper.insertSelective(record);
    }

    @Override
    public PmsProductSaleAttr selectByPrimaryKey(Long id) {
        return pmsProductSaleAttrMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductSaleAttr record) {
        return pmsProductSaleAttrMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductSaleAttr record) {
        return pmsProductSaleAttrMapper.updateByPrimaryKey(record);
    }

}
