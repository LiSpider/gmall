package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.OmsCompanyAddress;
import com.atguigu.gmall.user.mapper.OmsCompanyAddressMapper;
import com.atguigu.gmall.user.service.OmsCompanyAddressService;
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService{

    @Resource
    private OmsCompanyAddressMapper omsCompanyAddressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsCompanyAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.insertSelective(record);
    }

    @Override
    public OmsCompanyAddress selectByPrimaryKey(Long id) {
        return omsCompanyAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsCompanyAddress record) {
        return omsCompanyAddressMapper.updateByPrimaryKey(record);
    }

}
