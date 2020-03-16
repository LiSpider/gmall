package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.PmsProductInfoMapper;
import com.atguigu.gmall.user.bean.PmsProductInfo;
import com.atguigu.gmall.user.service.PmsProductInfoService;
@Service
public class PmsProductInfoServiceImpl implements PmsProductInfoService{

    @Resource
    private PmsProductInfoMapper pmsProductInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductInfo record) {
        return pmsProductInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductInfo record) {
        return pmsProductInfoMapper.insertSelective(record);
    }

    @Override
    public PmsProductInfo selectByPrimaryKey(Long id) {
        return pmsProductInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductInfo record) {
        return pmsProductInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductInfo record) {
        return pmsProductInfoMapper.updateByPrimaryKey(record);
    }

}
