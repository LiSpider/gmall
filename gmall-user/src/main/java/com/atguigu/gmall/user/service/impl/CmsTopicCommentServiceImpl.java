package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.CmsTopicCommentMapper;
import com.atguigu.gmall.user.bean.CmsTopicComment;
import com.atguigu.gmall.user.service.CmsTopicCommentService;
@Service
public class CmsTopicCommentServiceImpl implements CmsTopicCommentService{

    @Resource
    private CmsTopicCommentMapper cmsTopicCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsTopicCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsTopicComment record) {
        return cmsTopicCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsTopicComment record) {
        return cmsTopicCommentMapper.insertSelective(record);
    }

    @Override
    public CmsTopicComment selectByPrimaryKey(Long id) {
        return cmsTopicCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsTopicComment record) {
        return cmsTopicCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsTopicComment record) {
        return cmsTopicCommentMapper.updateByPrimaryKey(record);
    }

}
