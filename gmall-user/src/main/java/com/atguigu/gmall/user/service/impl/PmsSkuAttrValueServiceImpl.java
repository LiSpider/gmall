package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsSkuAttrValue;
import com.atguigu.gmall.user.mapper.PmsSkuAttrValueMapper;
import com.atguigu.gmall.user.service.PmsSkuAttrValueService;
@Service
public class PmsSkuAttrValueServiceImpl implements PmsSkuAttrValueService{

    @Resource
    private PmsSkuAttrValueMapper pmsSkuAttrValueMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsSkuAttrValueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsSkuAttrValue record) {
        return pmsSkuAttrValueMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsSkuAttrValue record) {
        return pmsSkuAttrValueMapper.insertSelective(record);
    }

    @Override
    public PmsSkuAttrValue selectByPrimaryKey(Long id) {
        return pmsSkuAttrValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsSkuAttrValue record) {
        return pmsSkuAttrValueMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsSkuAttrValue record) {
        return pmsSkuAttrValueMapper.updateByPrimaryKey(record);
    }

}
