package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.UmsAdminPermissionRelationMapper;
import com.atguigu.gmall.user.bean.UmsAdminPermissionRelation;
import com.atguigu.gmall.user.service.UmsAdminPermissionRelationService;
@Service
public class UmsAdminPermissionRelationServiceImpl implements UmsAdminPermissionRelationService{

    @Resource
    private UmsAdminPermissionRelationMapper umsAdminPermissionRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsAdminPermissionRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.insertSelective(record);
    }

    @Override
    public UmsAdminPermissionRelation selectByPrimaryKey(Long id) {
        return umsAdminPermissionRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsAdminPermissionRelation record) {
        return umsAdminPermissionRelationMapper.updateByPrimaryKey(record);
    }

}
