package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsProductImage;
import com.atguigu.gmall.user.mapper.PmsProductImageMapper;
import com.atguigu.gmall.user.service.PmsProductImageService;
@Service
public class PmsProductImageServiceImpl implements PmsProductImageService{

    @Resource
    private PmsProductImageMapper pmsProductImageMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductImage record) {
        return pmsProductImageMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductImage record) {
        return pmsProductImageMapper.insertSelective(record);
    }

    @Override
    public PmsProductImage selectByPrimaryKey(Long id) {
        return pmsProductImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductImage record) {
        return pmsProductImageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductImage record) {
        return pmsProductImageMapper.updateByPrimaryKey(record);
    }

}
