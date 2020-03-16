package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.WmsWareOrderTask;
public interface WmsWareOrderTaskService{


    int deleteByPrimaryKey(Long id);

    int insert(WmsWareOrderTask record);

    int insertSelective(WmsWareOrderTask record);

    WmsWareOrderTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareOrderTask record);

    int updateByPrimaryKey(WmsWareOrderTask record);

}
