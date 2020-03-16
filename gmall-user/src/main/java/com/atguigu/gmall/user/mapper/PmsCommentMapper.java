package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.PmsComment;

public interface PmsCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsComment record);

    int insertSelective(PmsComment record);

    PmsComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsComment record);

    int updateByPrimaryKey(PmsComment record);
}