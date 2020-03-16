package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.service.UmsMemberService;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UmsMemberServiceImpl implements UmsMemberService{

    @Resource
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> selectAll() {
        return umsMemberMapper.selectAll();
    }
}
