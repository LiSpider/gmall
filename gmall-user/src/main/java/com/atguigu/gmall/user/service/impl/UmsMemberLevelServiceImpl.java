package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.UmsMemberLevel;
import com.atguigu.gmall.user.mapper.UmsMemberLevelMapper;
import com.atguigu.gmall.user.service.UmsMemberLevelService;
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService{

    @Resource
    private UmsMemberLevelMapper umsMemberLevelMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberLevel record) {
        return umsMemberLevelMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberLevel record) {
        return umsMemberLevelMapper.insertSelective(record);
    }

    @Override
    public UmsMemberLevel selectByPrimaryKey(Long id) {
        return umsMemberLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberLevel record) {
        return umsMemberLevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberLevel record) {
        return umsMemberLevelMapper.updateByPrimaryKey(record);
    }

}
