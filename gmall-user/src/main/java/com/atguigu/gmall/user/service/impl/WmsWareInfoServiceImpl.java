package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.WmsWareInfoMapper;
import com.atguigu.gmall.user.bean.WmsWareInfo;
import com.atguigu.gmall.user.service.WmsWareInfoService;
@Service
public class WmsWareInfoServiceImpl implements WmsWareInfoService{

    @Resource
    private WmsWareInfoMapper wmsWareInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wmsWareInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(WmsWareInfo record) {
        return wmsWareInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(WmsWareInfo record) {
        return wmsWareInfoMapper.insertSelective(record);
    }

    @Override
    public WmsWareInfo selectByPrimaryKey(Long id) {
        return wmsWareInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WmsWareInfo record) {
        return wmsWareInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WmsWareInfo record) {
        return wmsWareInfoMapper.updateByPrimaryKey(record);
    }

}
