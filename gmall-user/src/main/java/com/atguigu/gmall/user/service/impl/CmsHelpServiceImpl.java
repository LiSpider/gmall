package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.CmsHelp;
import com.atguigu.gmall.user.mapper.CmsHelpMapper;
import com.atguigu.gmall.user.service.CmsHelpService;
@Service
public class CmsHelpServiceImpl implements CmsHelpService{

    @Resource
    private CmsHelpMapper cmsHelpMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cmsHelpMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CmsHelp record) {
        return cmsHelpMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsHelp record) {
        return cmsHelpMapper.insertSelective(record);
    }

    @Override
    public CmsHelp selectByPrimaryKey(Long id) {
        return cmsHelpMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsHelp record) {
        return cmsHelpMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsHelp record) {
        return cmsHelpMapper.updateByPrimaryKey(record);
    }

}
