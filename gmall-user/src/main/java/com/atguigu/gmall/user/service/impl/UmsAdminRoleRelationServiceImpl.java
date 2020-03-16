package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.UmsAdminRoleRelation;
import com.atguigu.gmall.user.mapper.UmsAdminRoleRelationMapper;
import com.atguigu.gmall.user.service.UmsAdminRoleRelationService;
@Service
public class UmsAdminRoleRelationServiceImpl implements UmsAdminRoleRelationService{

    @Resource
    private UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return umsAdminRoleRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.insertSelective(record);
    }

    @Override
    public UmsAdminRoleRelation selectByPrimaryKey(Integer id) {
        return umsAdminRoleRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsAdminRoleRelation record) {
        return umsAdminRoleRelationMapper.updateByPrimaryKey(record);
    }

}
