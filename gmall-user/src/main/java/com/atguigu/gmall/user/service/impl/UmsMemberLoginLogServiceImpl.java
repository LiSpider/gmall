package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.UmsMemberLoginLog;
import com.atguigu.gmall.user.mapper.UmsMemberLoginLogMapper;
import com.atguigu.gmall.user.service.UmsMemberLoginLogService;
@Service
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService{

    @Resource
    private UmsMemberLoginLogMapper umsMemberLoginLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberLoginLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.insertSelective(record);
    }

    @Override
    public UmsMemberLoginLog selectByPrimaryKey(Long id) {
        return umsMemberLoginLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberLoginLog record) {
        return umsMemberLoginLogMapper.updateByPrimaryKey(record);
    }

}
