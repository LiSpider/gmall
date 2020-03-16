package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.PmsBaseCatalog1;

public interface PmsBaseCatalog1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseCatalog1 record);

    int insertSelective(PmsBaseCatalog1 record);

    PmsBaseCatalog1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PmsBaseCatalog1 record);

    int updateByPrimaryKey(PmsBaseCatalog1 record);
}