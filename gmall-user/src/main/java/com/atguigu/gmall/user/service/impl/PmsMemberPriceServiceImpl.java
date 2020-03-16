package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.PmsMemberPrice;
import com.atguigu.gmall.user.mapper.PmsMemberPriceMapper;
import com.atguigu.gmall.user.service.PmsMemberPriceService;
@Service
public class PmsMemberPriceServiceImpl implements PmsMemberPriceService{

    @Resource
    private PmsMemberPriceMapper pmsMemberPriceMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsMemberPriceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsMemberPrice record) {
        return pmsMemberPriceMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsMemberPrice record) {
        return pmsMemberPriceMapper.insertSelective(record);
    }

    @Override
    public PmsMemberPrice selectByPrimaryKey(Long id) {
        return pmsMemberPriceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsMemberPrice record) {
        return pmsMemberPriceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsMemberPrice record) {
        return pmsMemberPriceMapper.updateByPrimaryKey(record);
    }

}
