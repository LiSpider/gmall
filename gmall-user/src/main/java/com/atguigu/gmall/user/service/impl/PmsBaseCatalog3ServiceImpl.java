package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsBaseCatalog3;
import com.atguigu.gmall.user.mapper.PmsBaseCatalog3Mapper;
import com.atguigu.gmall.user.service.PmsBaseCatalog3Service;
@Service
public class PmsBaseCatalog3ServiceImpl implements PmsBaseCatalog3Service{

    @Resource
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsBaseCatalog3Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsBaseCatalog3 record) {
        return pmsBaseCatalog3Mapper.insert(record);
    }

    @Override
    public int insertSelective(PmsBaseCatalog3 record) {
        return pmsBaseCatalog3Mapper.insertSelective(record);
    }

    @Override
    public PmsBaseCatalog3 selectByPrimaryKey(Long id) {
        return pmsBaseCatalog3Mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBaseCatalog3 record) {
        return pmsBaseCatalog3Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsBaseCatalog3 record) {
        return pmsBaseCatalog3Mapper.updateByPrimaryKey(record);
    }

}
