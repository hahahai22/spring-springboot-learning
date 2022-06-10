package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/6/10 09:11
 */
@Controller     // 控制器的注解
public class BootController {

    @RequestMapping("/hello")  // 地址是/hello
    @ResponseBody // 不使用视图，想让doSome方法的返回值作为数据返回给浏览器
    public String doSome(){
        return "hello SpringBoot应用，设置端口号";
    }
}
