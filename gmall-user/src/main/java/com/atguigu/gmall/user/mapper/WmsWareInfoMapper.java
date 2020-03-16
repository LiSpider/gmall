package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.WmsWareInfo;

public interface WmsWareInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareInfo record);

    int insertSelective(WmsWareInfo record);

    WmsWareInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareInfo record);

    int updateByPrimaryKey(WmsWareInfo record);
}