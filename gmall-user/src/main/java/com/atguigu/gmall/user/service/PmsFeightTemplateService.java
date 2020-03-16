package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsFeightTemplate;
public interface PmsFeightTemplateService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsFeightTemplate record);

    int insertSelective(PmsFeightTemplate record);

    PmsFeightTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    int updateByPrimaryKey(PmsFeightTemplate record);

}
