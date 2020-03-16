package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.UmsMemberTask;
import com.atguigu.gmall.user.mapper.UmsMemberTaskMapper;
import com.atguigu.gmall.user.service.UmsMemberTaskService;
@Service
public class UmsMemberTaskServiceImpl implements UmsMemberTaskService{

    @Resource
    private UmsMemberTaskMapper umsMemberTaskMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberTaskMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberTask record) {
        return umsMemberTaskMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberTask record) {
        return umsMemberTaskMapper.insertSelective(record);
    }

    @Override
    public UmsMemberTask selectByPrimaryKey(Long id) {
        return umsMemberTaskMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberTask record) {
        return umsMemberTaskMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberTask record) {
        return umsMemberTaskMapper.updateByPrimaryKey(record);
    }

}
