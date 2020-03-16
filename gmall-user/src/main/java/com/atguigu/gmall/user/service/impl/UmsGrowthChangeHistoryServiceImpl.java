package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.UmsGrowthChangeHistory;
import com.atguigu.gmall.user.mapper.UmsGrowthChangeHistoryMapper;
import com.atguigu.gmall.user.service.UmsGrowthChangeHistoryService;
@Service
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService{

    @Resource
    private UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsGrowthChangeHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.insertSelective(record);
    }

    @Override
    public UmsGrowthChangeHistory selectByPrimaryKey(Long id) {
        return umsGrowthChangeHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsGrowthChangeHistory record) {
        return umsGrowthChangeHistoryMapper.updateByPrimaryKey(record);
    }

}
