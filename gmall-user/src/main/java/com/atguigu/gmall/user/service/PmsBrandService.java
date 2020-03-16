package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsBrand;
public interface PmsBrandService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);

}
