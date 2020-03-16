package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.PmsCommentMapper;
import com.atguigu.gmall.user.bean.PmsComment;
import com.atguigu.gmall.user.service.PmsCommentService;
@Service
public class PmsCommentServiceImpl implements PmsCommentService{

    @Resource
    private PmsCommentMapper pmsCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsComment record) {
        return pmsCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsComment record) {
        return pmsCommentMapper.insertSelective(record);
    }

    @Override
    public PmsComment selectByPrimaryKey(Long id) {
        return pmsCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsComment record) {
        return pmsCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsComment record) {
        return pmsCommentMapper.updateByPrimaryKey(record);
    }

}
