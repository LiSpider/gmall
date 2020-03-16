package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsSkuSaleAttrValue;
import com.atguigu.gmall.user.mapper.PmsSkuSaleAttrValueMapper;
import com.atguigu.gmall.user.service.PmsSkuSaleAttrValueService;
@Service
public class PmsSkuSaleAttrValueServiceImpl implements PmsSkuSaleAttrValueService{

    @Resource
    private PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsSkuSaleAttrValueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsSkuSaleAttrValue record) {
        return pmsSkuSaleAttrValueMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsSkuSaleAttrValue record) {
        return pmsSkuSaleAttrValueMapper.insertSelective(record);
    }

    @Override
    public PmsSkuSaleAttrValue selectByPrimaryKey(Long id) {
        return pmsSkuSaleAttrValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsSkuSaleAttrValue record) {
        return pmsSkuSaleAttrValueMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsSkuSaleAttrValue record) {
        return pmsSkuSaleAttrValueMapper.updateByPrimaryKey(record);
    }

}
