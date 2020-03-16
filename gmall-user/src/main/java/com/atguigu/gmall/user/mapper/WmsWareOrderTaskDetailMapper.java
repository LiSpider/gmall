package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.WmsWareOrderTaskDetail;

public interface WmsWareOrderTaskDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareOrderTaskDetail record);

    int insertSelective(WmsWareOrderTaskDetail record);

    WmsWareOrderTaskDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareOrderTaskDetail record);

    int updateByPrimaryKey(WmsWareOrderTaskDetail record);
}