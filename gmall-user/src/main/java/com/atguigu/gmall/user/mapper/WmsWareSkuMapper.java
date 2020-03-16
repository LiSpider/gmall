package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.WmsWareSku;

public interface WmsWareSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareSku record);

    int insertSelective(WmsWareSku record);

    WmsWareSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareSku record);

    int updateByPrimaryKey(WmsWareSku record);
}