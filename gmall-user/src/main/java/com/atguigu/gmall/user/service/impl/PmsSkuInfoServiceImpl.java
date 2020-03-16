package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsSkuInfo;
import com.atguigu.gmall.user.mapper.PmsSkuInfoMapper;
import com.atguigu.gmall.user.service.PmsSkuInfoService;
@Service
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService{

    @Resource
    private PmsSkuInfoMapper pmsSkuInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsSkuInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsSkuInfo record) {
        return pmsSkuInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsSkuInfo record) {
        return pmsSkuInfoMapper.insertSelective(record);
    }

    @Override
    public PmsSkuInfo selectByPrimaryKey(Long id) {
        return pmsSkuInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsSkuInfo record) {
        return pmsSkuInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsSkuInfo record) {
        return pmsSkuInfoMapper.updateByPrimaryKey(record);
    }

}
