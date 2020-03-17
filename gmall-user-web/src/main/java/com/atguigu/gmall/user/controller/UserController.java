package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.service.UmsMemberReceiveAddressService;
import com.atguigu.gmall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LC
 */
@Controller
public class UserController {
    @Reference
    UmsMemberService umsMemberService;

    @Reference
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello user";
    }

    @RequestMapping("/users")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        return umsMemberService.selectAll();
    }


}
