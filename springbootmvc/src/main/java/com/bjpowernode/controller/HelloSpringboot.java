package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/22 15:36
 */
@Controller
public class HelloSpringboot {
    @RequestMapping("/hello")
    @ResponseBody
    public String HelloSpring() {
        return "欢迎使用SpringBoot框架";
    }
}
