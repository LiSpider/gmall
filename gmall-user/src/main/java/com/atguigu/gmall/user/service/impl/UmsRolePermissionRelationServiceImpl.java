package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.UmsRolePermissionRelationMapper;
import com.atguigu.gmall.user.bean.UmsRolePermissionRelation;
import com.atguigu.gmall.user.service.UmsRolePermissionRelationService;
@Service
public class UmsRolePermissionRelationServiceImpl implements UmsRolePermissionRelationService{

    @Resource
    private UmsRolePermissionRelationMapper umsRolePermissionRelationMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return umsRolePermissionRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.insertSelective(record);
    }

    @Override
    public UmsRolePermissionRelation selectByPrimaryKey(Integer id) {
        return umsRolePermissionRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsRolePermissionRelation record) {
        return umsRolePermissionRelationMapper.updateByPrimaryKey(record);
    }

}
