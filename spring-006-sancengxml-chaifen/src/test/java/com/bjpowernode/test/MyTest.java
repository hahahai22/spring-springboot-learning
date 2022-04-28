package com.bjpowernode.test;

import com.bjpowernode.controller.UsersController;
import com.bjpowernode.projo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 11:41
 */
public class MyTest {

    @Test
    public void testInsertUsers() {
        // 1、创建容器并启动
        ApplicationContext ctx = new ClassPathXmlApplicationContext("total.xml");
        // 2、取出对象
        // 只需要去uController对象即可，因为三个对象嵌套调用了
        UsersController usersController = (UsersController) ctx.getBean("uController");
        // 3、测试功能
        int num = usersController.insert(new Users(31134, "大头", 27));
        System.out.println(num);
    }
}
