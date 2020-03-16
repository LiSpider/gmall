package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.UmsAdminLoginLogMapper;
import com.atguigu.gmall.user.bean.UmsAdminLoginLog;
import com.atguigu.gmall.user.service.UmsAdminLoginLogService;
@Service
public class UmsAdminLoginLogServiceImpl implements UmsAdminLoginLogService{

    @Resource
    private UmsAdminLoginLogMapper umsAdminLoginLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsAdminLoginLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.insertSelective(record);
    }

    @Override
    public UmsAdminLoginLog selectByPrimaryKey(Long id) {
        return umsAdminLoginLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsAdminLoginLog record) {
        return umsAdminLoginLogMapper.updateByPrimaryKey(record);
    }

}
