package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsCommentReplay;
import com.atguigu.gmall.user.mapper.PmsCommentReplayMapper;
import com.atguigu.gmall.user.service.PmsCommentReplayService;
@Service
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService{

    @Resource
    private PmsCommentReplayMapper pmsCommentReplayMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsCommentReplayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsCommentReplay record) {
        return pmsCommentReplayMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsCommentReplay record) {
        return pmsCommentReplayMapper.insertSelective(record);
    }

    @Override
    public PmsCommentReplay selectByPrimaryKey(Long id) {
        return pmsCommentReplayMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsCommentReplay record) {
        return pmsCommentReplayMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsCommentReplay record) {
        return pmsCommentReplayMapper.updateByPrimaryKey(record);
    }

}
