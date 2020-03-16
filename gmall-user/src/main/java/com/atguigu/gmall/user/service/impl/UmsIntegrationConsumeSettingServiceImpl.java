package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.UmsIntegrationConsumeSettingMapper;
import com.atguigu.gmall.user.bean.UmsIntegrationConsumeSetting;
import com.atguigu.gmall.user.service.UmsIntegrationConsumeSettingService;
@Service
public class UmsIntegrationConsumeSettingServiceImpl implements UmsIntegrationConsumeSettingService{

    @Resource
    private UmsIntegrationConsumeSettingMapper umsIntegrationConsumeSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsIntegrationConsumeSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.insertSelective(record);
    }

    @Override
    public UmsIntegrationConsumeSetting selectByPrimaryKey(Long id) {
        return umsIntegrationConsumeSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsIntegrationConsumeSetting record) {
        return umsIntegrationConsumeSettingMapper.updateByPrimaryKey(record);
    }

}
