package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsFeightTemplate;
import com.atguigu.gmall.user.mapper.PmsFeightTemplateMapper;
import com.atguigu.gmall.user.service.PmsFeightTemplateService;
@Service
public class PmsFeightTemplateServiceImpl implements PmsFeightTemplateService{

    @Resource
    private PmsFeightTemplateMapper pmsFeightTemplateMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsFeightTemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.insertSelective(record);
    }

    @Override
    public PmsFeightTemplate selectByPrimaryKey(Long id) {
        return pmsFeightTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsFeightTemplate record) {
        return pmsFeightTemplateMapper.updateByPrimaryKey(record);
    }

}
