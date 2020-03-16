package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.UmsMemberTagMapper;
import com.atguigu.gmall.user.bean.UmsMemberTag;
import com.atguigu.gmall.user.service.UmsMemberTagService;
@Service
public class UmsMemberTagServiceImpl implements UmsMemberTagService{

    @Resource
    private UmsMemberTagMapper umsMemberTagMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberTagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberTag record) {
        return umsMemberTagMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberTag record) {
        return umsMemberTagMapper.insertSelective(record);
    }

    @Override
    public UmsMemberTag selectByPrimaryKey(Long id) {
        return umsMemberTagMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberTag record) {
        return umsMemberTagMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberTag record) {
        return umsMemberTagMapper.updateByPrimaryKey(record);
    }

}
