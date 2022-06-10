package com.bjpowernode.controller;

import com.bjpowernode.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/6/10 11:24
 */
@Controller
public class HelloController {

    /**
     * 通过配置文件提供数据
     */
    @Value("${server.port}")  // 拿到端口号的值，使用k得到v
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String schoolName;

    @Value("${site}")
    private String site;

    @Resource   // 自动注入
    // 从容器中拿到SchoolInfo对象赋给info
    private SchoolInfo info;

    @RequestMapping("/data")
    @ResponseBody  // 返回值
    public String queryData(){
        return schoolName + " ," + "site:" + site + "项目访问的端口号：" + port + " ," + "项目访问的地址："  + contextPath;
    }

    @RequestMapping("/info")
    @ResponseBody  // 返回值
    public String queryInfo(){
        return "SchoolInfo对象信息：" + info.toString();
    }
}
