package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.OmsOrderSetting;
import com.atguigu.gmall.user.mapper.OmsOrderSettingMapper;
import com.atguigu.gmall.user.service.OmsOrderSettingService;
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService{

    @Resource
    private OmsOrderSettingMapper omsOrderSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderSetting record) {
        return omsOrderSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsOrderSetting record) {
        return omsOrderSettingMapper.insertSelective(record);
    }

    @Override
    public OmsOrderSetting selectByPrimaryKey(Long id) {
        return omsOrderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderSetting record) {
        return omsOrderSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderSetting record) {
        return omsOrderSettingMapper.updateByPrimaryKey(record);
    }

}
