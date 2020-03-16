package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.CmsSubjectCategoryMapper;
import com.atguigu.gmall.user.bean.CmsSubjectCategory;
import com.atguigu.gmall.user.service.CmsSubjectCategoryService;
@Service
public class CmsSubjectCategoryServiceImpl implements CmsSubjectCategoryService{

    @Resource
    private CmsSubjectCategoryMapper cmsSubjectCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cmsSubjectCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.insertSelective(record);
    }

    @Override
    public CmsSubjectCategory selectByPrimaryKey(Integer id) {
        return cmsSubjectCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsSubjectCategory record) {
        return cmsSubjectCategoryMapper.updateByPrimaryKey(record);
    }

}
