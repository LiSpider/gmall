package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsProductOperateLog;
import com.atguigu.gmall.user.mapper.PmsProductOperateLogMapper;
import com.atguigu.gmall.user.service.PmsProductOperateLogService;
@Service
public class PmsProductOperateLogServiceImpl implements PmsProductOperateLogService{

    @Resource
    private PmsProductOperateLogMapper pmsProductOperateLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductOperateLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.insertSelective(record);
    }

    @Override
    public PmsProductOperateLog selectByPrimaryKey(Long id) {
        return pmsProductOperateLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductOperateLog record) {
        return pmsProductOperateLogMapper.updateByPrimaryKey(record);
    }

}
