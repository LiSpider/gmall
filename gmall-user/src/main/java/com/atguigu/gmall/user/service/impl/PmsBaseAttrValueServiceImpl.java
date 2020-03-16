package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.PmsBaseAttrValueMapper;
import com.atguigu.gmall.user.bean.PmsBaseAttrValue;
import com.atguigu.gmall.user.service.PmsBaseAttrValueService;
@Service
public class PmsBaseAttrValueServiceImpl implements PmsBaseAttrValueService{

    @Resource
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsBaseAttrValueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsBaseAttrValue record) {
        return pmsBaseAttrValueMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsBaseAttrValue record) {
        return pmsBaseAttrValueMapper.insertSelective(record);
    }

    @Override
    public PmsBaseAttrValue selectByPrimaryKey(Long id) {
        return pmsBaseAttrValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBaseAttrValue record) {
        return pmsBaseAttrValueMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsBaseAttrValue record) {
        return pmsBaseAttrValueMapper.updateByPrimaryKey(record);
    }

}
