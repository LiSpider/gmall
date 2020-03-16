package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.WmsWareSku;
import com.atguigu.gmall.user.mapper.WmsWareSkuMapper;
import com.atguigu.gmall.user.service.WmsWareSkuService;
@Service
public class WmsWareSkuServiceImpl implements WmsWareSkuService{

    @Resource
    private WmsWareSkuMapper wmsWareSkuMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsWareSkuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(WmsWareSku record) {
        return wmsWareSkuMapper.insert(record);
    }

    @Override
    public int insertSelective(WmsWareSku record) {
        return wmsWareSkuMapper.insertSelective(record);
    }

    @Override
    public WmsWareSku selectByPrimaryKey(Long id) {
        return wmsWareSkuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsWareSku record) {
        return wmsWareSkuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WmsWareSku record) {
        return wmsWareSkuMapper.updateByPrimaryKey(record);
    }

}
