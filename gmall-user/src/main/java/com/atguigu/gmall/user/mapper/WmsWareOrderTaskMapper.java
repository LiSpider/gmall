package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.WmsWareOrderTask;

public interface WmsWareOrderTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareOrderTask record);

    int insertSelective(WmsWareOrderTask record);

    WmsWareOrderTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareOrderTask record);

    int updateByPrimaryKey(WmsWareOrderTask record);
}