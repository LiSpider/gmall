package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.UmsMemberRuleSettingMapper;
import com.atguigu.gmall.user.bean.UmsMemberRuleSetting;
import com.atguigu.gmall.user.service.UmsMemberRuleSettingService;
@Service
public class UmsMemberRuleSettingServiceImpl implements UmsMemberRuleSettingService{

    @Resource
    private UmsMemberRuleSettingMapper umsMemberRuleSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberRuleSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.insertSelective(record);
    }

    @Override
    public UmsMemberRuleSetting selectByPrimaryKey(Long id) {
        return umsMemberRuleSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberRuleSetting record) {
        return umsMemberRuleSettingMapper.updateByPrimaryKey(record);
    }

}
