package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.UmsIntegrationChangeHistory;
import com.atguigu.gmall.user.mapper.UmsIntegrationChangeHistoryMapper;
import com.atguigu.gmall.user.service.UmsIntegrationChangeHistoryService;
@Service
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService{

    @Resource
    private UmsIntegrationChangeHistoryMapper umsIntegrationChangeHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsIntegrationChangeHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.insertSelective(record);
    }

    @Override
    public UmsIntegrationChangeHistory selectByPrimaryKey(Long id) {
        return umsIntegrationChangeHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsIntegrationChangeHistory record) {
        return umsIntegrationChangeHistoryMapper.updateByPrimaryKey(record);
    }

}
