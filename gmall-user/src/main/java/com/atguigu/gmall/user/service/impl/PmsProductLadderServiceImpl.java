package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.PmsProductLadderMapper;
import com.atguigu.gmall.user.bean.PmsProductLadder;
import com.atguigu.gmall.user.service.PmsProductLadderService;
@Service
public class PmsProductLadderServiceImpl implements PmsProductLadderService{

    @Resource
    private PmsProductLadderMapper pmsProductLadderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductLadderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductLadder record) {
        return pmsProductLadderMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductLadder record) {
        return pmsProductLadderMapper.insertSelective(record);
    }

    @Override
    public PmsProductLadder selectByPrimaryKey(Long id) {
        return pmsProductLadderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductLadder record) {
        return pmsProductLadderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductLadder record) {
        return pmsProductLadderMapper.updateByPrimaryKey(record);
    }

}
