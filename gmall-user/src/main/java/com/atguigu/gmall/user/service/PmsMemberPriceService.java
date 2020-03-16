package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsMemberPrice;
public interface PmsMemberPriceService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsMemberPrice record);

    int insertSelective(PmsMemberPrice record);

    PmsMemberPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsMemberPrice record);

    int updateByPrimaryKey(PmsMemberPrice record);

}
