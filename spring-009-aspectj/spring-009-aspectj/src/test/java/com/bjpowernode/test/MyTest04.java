package com.bjpowernode.test;

import com.bjpowernode.s04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/25 16:15
 */
public class MyTest04 {
    @Test
    public void Test01() {
        // 1、创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        // 2、取出代理对象
        /**
         * 下面这个对象someService已经不是原始的一个业务实现的功能，而是加入切面功能的对象
         */
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        String s = someService.doSome("zhangsan", 22);
        System.out.println("在测试方法中，目标方法的返回值" + s);

        /**运行结果
         * 环绕通知中的前置通知功能执行。。。。。
         * 前置通知方法执行。。。。。
         * doSome业务方法被执行。。。。。zhangsan
         * 环绕通知中的后置功能被实现。。。。。
         * 最终通知方法执行。。。。。
         * 后置通知方法执行。。。。。
         * 在测试方法中，目标方法的返回值abcd
         */
    }

}
