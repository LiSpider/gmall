package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.CmsTopicMapper;
import com.atguigu.gmall.user.bean.CmsTopic;
import com.atguigu.gmall.user.service.CmsTopicService;
@Service
public class CmsTopicServiceImpl implements CmsTopicService{

    @Resource
    private CmsTopicMapper cmsTopicMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsTopicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsTopic record) {
        return cmsTopicMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsTopic record) {
        return cmsTopicMapper.insertSelective(record);
    }

    @Override
    public CmsTopic selectByPrimaryKey(Long id) {
        return cmsTopicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsTopic record) {
        return cmsTopicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsTopic record) {
        return cmsTopicMapper.updateByPrimaryKey(record);
    }

}
