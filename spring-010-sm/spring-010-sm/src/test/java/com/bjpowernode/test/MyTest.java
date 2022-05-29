package com.bjpowernode.test;

import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/29 14:14
 */
public class MyTest {
    @Test
    public void Test01() {
        // 创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        // 取出UserServiceImpl
        UsersService uservice = (UsersService) ac.getBean("userServiceImpl");
        int num = uservice.insert(new Users(100, "zhangsan", "123"));
        System.out.println(num);
    }
}
