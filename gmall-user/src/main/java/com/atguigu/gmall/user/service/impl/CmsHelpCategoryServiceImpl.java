package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.CmsHelpCategoryMapper;
import com.atguigu.gmall.user.bean.CmsHelpCategory;
import com.atguigu.gmall.user.service.CmsHelpCategoryService;
@Service
public class CmsHelpCategoryServiceImpl implements CmsHelpCategoryService{

    @Resource
    private CmsHelpCategoryMapper cmsHelpCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsHelpCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.insertSelective(record);
    }

    @Override
    public CmsHelpCategory selectByPrimaryKey(Long id) {
        return cmsHelpCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsHelpCategory record) {
        return cmsHelpCategoryMapper.updateByPrimaryKey(record);
    }

}
