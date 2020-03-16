package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.PmsBaseAttrInfoMapper;
import com.atguigu.gmall.user.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.user.service.PmsBaseAttrInfoService;
@Service
public class PmsBaseAttrInfoServiceImpl implements PmsBaseAttrInfoService{

    @Resource
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return pmsBaseAttrInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsBaseAttrInfo record) {
        return pmsBaseAttrInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsBaseAttrInfo record) {
        return pmsBaseAttrInfoMapper.insertSelective(record);
    }

    @Override
    public PmsBaseAttrInfo selectByPrimaryKey(Integer id) {
        return pmsBaseAttrInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBaseAttrInfo record) {
        return pmsBaseAttrInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsBaseAttrInfo record) {
        return pmsBaseAttrInfoMapper.updateByPrimaryKey(record);
    }

}
