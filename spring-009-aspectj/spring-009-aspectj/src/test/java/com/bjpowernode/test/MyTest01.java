package com.bjpowernode.test;

import com.bjpowernode.s01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/25 16:15
 */
public class MyTest01 {
    @Test
    public void Test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        // 取出代理对象
        /**
         * 下面这个对象someService已经不是原始的一个业务实现的功能，而是加入切面功能的对象
         */
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(someService.getClass() );
        String s = someService.doSome("zhangsan", 22);
        System.out.println(s);
    }

    @Test
    public void Test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        // 取出代理对象
        /**
         * 下面这个对象someService已经不是原始的一个业务实现的功能，而是加入切面功能的对象
         */
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        someService.show();
    }
}
