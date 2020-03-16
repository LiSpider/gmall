package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.CmsSubjectMapper;
import com.atguigu.gmall.user.bean.CmsSubject;
import com.atguigu.gmall.user.service.CmsSubjectService;
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService{

    @Resource
    private CmsSubjectMapper cmsSubjectMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsSubjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsSubject record) {
        return cmsSubjectMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsSubject record) {
        return cmsSubjectMapper.insertSelective(record);
    }

    @Override
    public CmsSubject selectByPrimaryKey(Long id) {
        return cmsSubjectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsSubject record) {
        return cmsSubjectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsSubject record) {
        return cmsSubjectMapper.updateByPrimaryKey(record);
    }

}
