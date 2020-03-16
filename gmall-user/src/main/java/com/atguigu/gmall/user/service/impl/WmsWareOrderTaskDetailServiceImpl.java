package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.WmsWareOrderTaskDetail;
import com.atguigu.gmall.user.mapper.WmsWareOrderTaskDetailMapper;
import com.atguigu.gmall.user.service.WmsWareOrderTaskDetailService;
@Service
public class WmsWareOrderTaskDetailServiceImpl implements WmsWareOrderTaskDetailService{

    @Resource
    private WmsWareOrderTaskDetailMapper wmsWareOrderTaskDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsWareOrderTaskDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(WmsWareOrderTaskDetail record) {
        return wmsWareOrderTaskDetailMapper.insert(record);
    }

    @Override
    public int insertSelective(WmsWareOrderTaskDetail record) {
        return wmsWareOrderTaskDetailMapper.insertSelective(record);
    }

    @Override
    public WmsWareOrderTaskDetail selectByPrimaryKey(Long id) {
        return wmsWareOrderTaskDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsWareOrderTaskDetail record) {
        return wmsWareOrderTaskDetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WmsWareOrderTaskDetail record) {
        return wmsWareOrderTaskDetailMapper.updateByPrimaryKey(record);
    }

}
