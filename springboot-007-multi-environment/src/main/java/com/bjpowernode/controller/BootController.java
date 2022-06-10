package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/6/10 10:13
 */
@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome() {
        return "SpringBoot多环境配置";
    }
}
