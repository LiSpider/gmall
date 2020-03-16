package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.CmsMemberReport;

public interface CmsMemberReportMapper {
    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);
}