package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Book模块控制器类
 */
@Controller
@RequestMapping("/book")
public class Bookcontroller {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("book save");
        return "book save";
    }
}
