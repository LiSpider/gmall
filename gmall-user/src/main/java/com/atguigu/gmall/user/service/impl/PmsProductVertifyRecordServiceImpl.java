package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.PmsProductVertifyRecordMapper;
import com.atguigu.gmall.user.bean.PmsProductVertifyRecord;
import com.atguigu.gmall.user.service.PmsProductVertifyRecordService;
@Service
public class PmsProductVertifyRecordServiceImpl implements PmsProductVertifyRecordService{

    @Resource
    private PmsProductVertifyRecordMapper pmsProductVertifyRecordMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductVertifyRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.insertSelective(record);
    }

    @Override
    public PmsProductVertifyRecord selectByPrimaryKey(Long id) {
        return pmsProductVertifyRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductVertifyRecord record) {
        return pmsProductVertifyRecordMapper.updateByPrimaryKey(record);
    }

}
