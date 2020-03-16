package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.PmsBaseAttrInfo;

public interface PmsBaseAttrInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseAttrInfo record);

    int insertSelective(PmsBaseAttrInfo record);

    PmsBaseAttrInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PmsBaseAttrInfo record);

    int updateByPrimaryKey(PmsBaseAttrInfo record);
}