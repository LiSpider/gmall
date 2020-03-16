package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.PmsCommentReplay;
public interface PmsCommentReplayService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReplay record);

    int insertSelective(PmsCommentReplay record);

    PmsCommentReplay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsCommentReplay record);

    int updateByPrimaryKey(PmsCommentReplay record);

}
