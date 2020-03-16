package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.UmsMemberProductCategoryRelation;
import com.atguigu.gmall.user.mapper.UmsMemberProductCategoryRelationMapper;
import com.atguigu.gmall.user.service.UmsMemberProductCategoryRelationService;
@Service
public class UmsMemberProductCategoryRelationServiceImpl implements UmsMemberProductCategoryRelationService{

    @Resource
    private UmsMemberProductCategoryRelationMapper umsMemberProductCategoryRelationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberProductCategoryRelationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.insertSelective(record);
    }

    @Override
    public UmsMemberProductCategoryRelation selectByPrimaryKey(Long id) {
        return umsMemberProductCategoryRelationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberProductCategoryRelation record) {
        return umsMemberProductCategoryRelationMapper.updateByPrimaryKey(record);
    }

}
