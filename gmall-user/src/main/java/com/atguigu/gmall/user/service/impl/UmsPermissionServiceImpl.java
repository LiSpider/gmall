package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.UmsPermissionMapper;
import com.atguigu.gmall.user.bean.UmsPermission;
import com.atguigu.gmall.user.service.UmsPermissionService;
@Service
public class UmsPermissionServiceImpl implements UmsPermissionService{

    @Resource
    private UmsPermissionMapper umsPermissionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsPermission record) {
        return umsPermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsPermission record) {
        return umsPermissionMapper.insertSelective(record);
    }

    @Override
    public UmsPermission selectByPrimaryKey(Long id) {
        return umsPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsPermission record) {
        return umsPermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsPermission record) {
        return umsPermissionMapper.updateByPrimaryKey(record);
    }

}
