package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.CmsPrefrenceAreaProductRelationMapper;
import com.atguigu.gmall.user.bean.CmsPrefrenceAreaProductRelation;
import com.atguigu.gmall.user.service.CmsPrefrenceAreaProductRelationService;
@Service
public class CmsPrefrenceAreaProductRelationServiceImpl implements CmsPrefrenceAreaProductRelationService{

    @Resource
    private CmsPrefrenceAreaProductRelationMapper cmsPrefrenceAreaProductRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsPrefrenceAreaProductRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.insertSelective(record);
    }

    @Override
    public CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id) {
        return cmsPrefrenceAreaProductRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record) {
        return cmsPrefrenceAreaProductRelationMapper.updateByPrimaryKey(record);
    }

}
