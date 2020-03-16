package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMemberRuleSetting;
public interface UmsMemberRuleSettingService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberRuleSetting record);

    int insertSelective(UmsMemberRuleSetting record);

    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    int updateByPrimaryKey(UmsMemberRuleSetting record);

}
