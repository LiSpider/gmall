package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.CmsSubjectProductRelationMapper;
import com.atguigu.gmall.user.bean.CmsSubjectProductRelation;
import com.atguigu.gmall.user.service.CmsSubjectProductRelationService;
@Service
public class CmsSubjectProductRelationServiceImpl implements CmsSubjectProductRelationService{

    @Resource
    private CmsSubjectProductRelationMapper cmsSubjectProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsSubjectProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.insertSelective(record);
    }

    @Override
    public CmsSubjectProductRelation selectByPrimaryKey(Long id) {
        return cmsSubjectProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsSubjectProductRelation record) {
        return cmsSubjectProductRelationMapper.updateByPrimaryKey(record);
    }

}
