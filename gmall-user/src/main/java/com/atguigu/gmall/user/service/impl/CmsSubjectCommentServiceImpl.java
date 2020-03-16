package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.CmsSubjectCommentMapper;
import com.atguigu.gmall.user.bean.CmsSubjectComment;
import com.atguigu.gmall.user.service.CmsSubjectCommentService;
@Service
public class CmsSubjectCommentServiceImpl implements CmsSubjectCommentService{

    @Resource
    private CmsSubjectCommentMapper cmsSubjectCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsSubjectCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.insertSelective(record);
    }

    @Override
    public CmsSubjectComment selectByPrimaryKey(Long id) {
        return cmsSubjectCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsSubjectComment record) {
        return cmsSubjectCommentMapper.updateByPrimaryKey(record);
    }

}
