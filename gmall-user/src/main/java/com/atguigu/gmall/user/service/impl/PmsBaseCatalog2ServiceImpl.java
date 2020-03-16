package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsBaseCatalog2;
import com.atguigu.gmall.user.mapper.PmsBaseCatalog2Mapper;
import com.atguigu.gmall.user.service.PmsBaseCatalog2Service;
@Service
public class PmsBaseCatalog2ServiceImpl implements PmsBaseCatalog2Service{

    @Resource
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return pmsBaseCatalog2Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsBaseCatalog2 record) {
        return pmsBaseCatalog2Mapper.insert(record);
    }

    @Override
    public int insertSelective(PmsBaseCatalog2 record) {
        return pmsBaseCatalog2Mapper.insertSelective(record);
    }

    @Override
    public PmsBaseCatalog2 selectByPrimaryKey(Integer id) {
        return pmsBaseCatalog2Mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBaseCatalog2 record) {
        return pmsBaseCatalog2Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsBaseCatalog2 record) {
        return pmsBaseCatalog2Mapper.updateByPrimaryKey(record);
    }

}
