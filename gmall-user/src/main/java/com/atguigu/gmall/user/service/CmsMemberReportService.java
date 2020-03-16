package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.CmsMemberReport;
public interface CmsMemberReportService{


    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);

}
