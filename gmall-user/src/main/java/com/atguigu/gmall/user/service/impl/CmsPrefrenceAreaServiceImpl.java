package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.CmsPrefrenceAreaMapper;
import com.atguigu.gmall.user.bean.CmsPrefrenceArea;
import com.atguigu.gmall.user.service.CmsPrefrenceAreaService;
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService{

    @Resource
    private CmsPrefrenceAreaMapper cmsPrefrenceAreaMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsPrefrenceAreaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.insertSelective(record);
    }

    @Override
    public CmsPrefrenceArea selectByPrimaryKey(Long id) {
        return cmsPrefrenceAreaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsPrefrenceArea record) {
        return cmsPrefrenceAreaMapper.updateByPrimaryKey(record);
    }

}
