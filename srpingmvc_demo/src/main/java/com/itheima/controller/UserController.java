package com.itheima.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User控制器类
 * 1，将它交给spring管理
 * 2，定义处理请求的具体方法
 * 3，设置当前方法的访问路径
 * 4，设置返回数据类型为String
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    @ResponseBody
    public String save() {
        System.out.println("user save");
        return "springmvc";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update() {
        System.out.println("user update");
        return "springmvc";
    }

}
