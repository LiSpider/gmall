package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.UmsMemberStatisticsInfo;
import com.atguigu.gmall.user.mapper.UmsMemberStatisticsInfoMapper;
import com.atguigu.gmall.user.service.UmsMemberStatisticsInfoService;
@Service
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService{

    @Resource
    private UmsMemberStatisticsInfoMapper umsMemberStatisticsInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberStatisticsInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.insertSelective(record);
    }

    @Override
    public UmsMemberStatisticsInfo selectByPrimaryKey(Long id) {
        return umsMemberStatisticsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberStatisticsInfo record) {
        return umsMemberStatisticsInfoMapper.updateByPrimaryKey(record);
    }

}
