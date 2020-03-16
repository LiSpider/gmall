package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.CmsTopicCategory;
import com.atguigu.gmall.user.mapper.CmsTopicCategoryMapper;
import com.atguigu.gmall.user.service.CmsTopicCategoryService;
@Service
public class CmsTopicCategoryServiceImpl implements CmsTopicCategoryService{

    @Resource
    private CmsTopicCategoryMapper cmsTopicCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsTopicCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.insertSelective(record);
    }

    @Override
    public CmsTopicCategory selectByPrimaryKey(Long id) {
        return cmsTopicCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsTopicCategory record) {
        return cmsTopicCategoryMapper.updateByPrimaryKey(record);
    }

}
