package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsBaseCatalog1;
import com.atguigu.gmall.user.mapper.PmsBaseCatalog1Mapper;
import com.atguigu.gmall.user.service.PmsBaseCatalog1Service;
@Service
public class PmsBaseCatalog1ServiceImpl implements PmsBaseCatalog1Service{

    @Resource
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return pmsBaseCatalog1Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsBaseCatalog1 record) {
        return pmsBaseCatalog1Mapper.insert(record);
    }

    @Override
    public int insertSelective(PmsBaseCatalog1 record) {
        return pmsBaseCatalog1Mapper.insertSelective(record);
    }

    @Override
    public PmsBaseCatalog1 selectByPrimaryKey(Integer id) {
        return pmsBaseCatalog1Mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBaseCatalog1 record) {
        return pmsBaseCatalog1Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsBaseCatalog1 record) {
        return pmsBaseCatalog1Mapper.updateByPrimaryKey(record);
    }

}
