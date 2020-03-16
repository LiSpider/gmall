package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.OmsOrderReturnApply;
public interface OmsOrderReturnApplyService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnApply record);

    int insertSelective(OmsOrderReturnApply record);

    OmsOrderReturnApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    int updateByPrimaryKey(OmsOrderReturnApply record);

}
