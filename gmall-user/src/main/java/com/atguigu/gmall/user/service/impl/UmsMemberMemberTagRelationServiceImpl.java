package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.UmsMemberMemberTagRelationMapper;
import com.atguigu.gmall.user.bean.UmsMemberMemberTagRelation;
import com.atguigu.gmall.user.service.UmsMemberMemberTagRelationService;
@Service
public class UmsMemberMemberTagRelationServiceImpl implements UmsMemberMemberTagRelationService{

    @Resource
    private UmsMemberMemberTagRelationMapper umsMemberMemberTagRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberMemberTagRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.insertSelective(record);
    }

    @Override
    public UmsMemberMemberTagRelation selectByPrimaryKey(Long id) {
        return umsMemberMemberTagRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberMemberTagRelation record) {
        return umsMemberMemberTagRelationMapper.updateByPrimaryKey(record);
    }

}
