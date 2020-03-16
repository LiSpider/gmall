package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsSkuImage;
import com.atguigu.gmall.user.mapper.PmsSkuImageMapper;
import com.atguigu.gmall.user.service.PmsSkuImageService;
@Service
public class PmsSkuImageServiceImpl implements PmsSkuImageService{

    @Resource
    private PmsSkuImageMapper pmsSkuImageMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsSkuImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsSkuImage record) {
        return pmsSkuImageMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsSkuImage record) {
        return pmsSkuImageMapper.insertSelective(record);
    }

    @Override
    public PmsSkuImage selectByPrimaryKey(Long id) {
        return pmsSkuImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsSkuImage record) {
        return pmsSkuImageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsSkuImage record) {
        return pmsSkuImageMapper.updateByPrimaryKey(record);
    }

}
