package com.bjpowernode.test;

import com.bjpowernode.pojo.Accounts;
import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.AccountsService;
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
        // 取出UserServiceImpl对象
        UsersService uservice = (UsersService) ac.getBean("userServiceImpl");
        int num = uservice.insert(new Users(100, "zhangsan", "123"));
        System.out.println(num);
    }

    @Test
    public void Test02() {
        // 创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        // 取出AccountService对象
        AccountsService accountsService = (AccountsService) ac.getBean("accountsServiceImpl");
        System.out.println(accountsService.getClass());
        // 传入实体类对象
        accountsService.save(new Accounts(204, "李六2", "账户安全04"));
    }

    @Test
    public void TestTrans() {
        // 创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_trans.xml");
        // 取出UserServiceImpl对象
        UsersService uservice = (UsersService) ac.getBean("userServiceImpl");
        int num = uservice.insert(new Users(100, "zhangsan", "123"));
        System.out.println(num);
    }
}
