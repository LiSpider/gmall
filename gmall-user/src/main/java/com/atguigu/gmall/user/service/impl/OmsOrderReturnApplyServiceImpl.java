package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.mapper.OmsOrderReturnApplyMapper;
import com.atguigu.gmall.user.bean.OmsOrderReturnApply;
import com.atguigu.gmall.user.service.OmsOrderReturnApplyService;
@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService{

    @Resource
    private OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderReturnApplyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.insertSelective(record);
    }

    @Override
    public OmsOrderReturnApply selectByPrimaryKey(Long id) {
        return omsOrderReturnApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderReturnApply record) {
        return omsOrderReturnApplyMapper.updateByPrimaryKey(record);
    }

}
