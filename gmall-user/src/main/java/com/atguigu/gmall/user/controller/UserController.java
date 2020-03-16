package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import com.atguigu.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LC
 */
@Controller
public class UserController {
    @Autowired
    UmsMemberService umsMemberService;

    @Autowired
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

    @RequestMapping(value = "/getReceiveAddressByMemberId",method = RequestMethod.GET)
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId) {
        return umsMemberReceiveAddressService.selectReceiveAddressByMemberId(memberId);
    }
}
