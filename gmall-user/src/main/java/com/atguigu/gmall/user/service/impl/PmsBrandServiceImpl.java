package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.PmsBrandMapper;
import com.atguigu.gmall.user.bean.PmsBrand;
import com.atguigu.gmall.user.service.PmsBrandService;
@Service
public class PmsBrandServiceImpl implements PmsBrandService{

    @Resource
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsBrand record) {
        return pmsBrandMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsBrand record) {
        return pmsBrandMapper.insertSelective(record);
    }

    @Override
    public PmsBrand selectByPrimaryKey(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBrand record) {
        return pmsBrandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsBrand record) {
        return pmsBrandMapper.updateByPrimaryKey(record);
    }

}
