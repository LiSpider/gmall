package com.atguigu.gmall.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.gmall.user.bean.CmsMemberReport;
import com.atguigu.gmall.user.mapper.CmsMemberReportMapper;
import com.atguigu.gmall.user.service.CmsMemberReportService;
@Service
public class CmsMemberReportServiceImpl implements CmsMemberReportService{

    @Resource
    private CmsMemberReportMapper cmsMemberReportMapper;

    @Override
    public int insert(CmsMemberReport record) {
        return cmsMemberReportMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsMemberReport record) {
        return cmsMemberReportMapper.insertSelective(record);
    }

}
