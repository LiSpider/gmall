package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.WmsWareOrderTaskMapper;
import com.atguigu.gmall.user.bean.WmsWareOrderTask;
import com.atguigu.gmall.user.service.WmsWareOrderTaskService;
@Service
public class WmsWareOrderTaskServiceImpl implements WmsWareOrderTaskService{

    @Resource
    private WmsWareOrderTaskMapper wmsWareOrderTaskMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsWareOrderTaskMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(WmsWareOrderTask record) {
        return wmsWareOrderTaskMapper.insert(record);
    }

    @Override
    public int insertSelective(WmsWareOrderTask record) {
        return wmsWareOrderTaskMapper.insertSelective(record);
    }

    @Override
    public WmsWareOrderTask selectByPrimaryKey(Long id) {
        return wmsWareOrderTaskMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsWareOrderTask record) {
        return wmsWareOrderTaskMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WmsWareOrderTask record) {
        return wmsWareOrderTaskMapper.updateByPrimaryKey(record);
    }

}
