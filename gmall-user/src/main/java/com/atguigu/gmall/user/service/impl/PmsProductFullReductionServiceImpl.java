package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.PmsProductFullReductionMapper;
import com.atguigu.gmall.user.bean.PmsProductFullReduction;
import com.atguigu.gmall.user.service.PmsProductFullReductionService;
@Service
public class PmsProductFullReductionServiceImpl implements PmsProductFullReductionService{

    @Resource
    private PmsProductFullReductionMapper pmsProductFullReductionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductFullReductionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.insertSelective(record);
    }

    @Override
    public PmsProductFullReduction selectByPrimaryKey(Long id) {
        return pmsProductFullReductionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductFullReduction record) {
        return pmsProductFullReductionMapper.updateByPrimaryKey(record);
    }

}
