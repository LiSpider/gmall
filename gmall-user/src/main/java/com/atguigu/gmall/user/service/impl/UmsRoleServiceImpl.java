package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.UmsRoleMapper;
import com.atguigu.gmall.user.bean.UmsRole;
import com.atguigu.gmall.user.service.UmsRoleService;
@Service
public class UmsRoleServiceImpl implements UmsRoleService{

    @Resource
    private UmsRoleMapper umsRoleMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsRole record) {
        return umsRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsRole record) {
        return umsRoleMapper.insertSelective(record);
    }

    @Override
    public UmsRole selectByPrimaryKey(Long id) {
        return umsRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsRole record) {
        return umsRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsRole record) {
        return umsRoleMapper.updateByPrimaryKey(record);
    }

}
