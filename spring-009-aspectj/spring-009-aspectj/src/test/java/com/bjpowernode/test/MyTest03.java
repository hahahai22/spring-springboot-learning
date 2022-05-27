package com.bjpowernode.test;

import com.bjpowernode.s03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/25 16:15
 */
public class MyTest03 {
    @Test
    public void Test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        // 取出代理对象
        /**
         * 下面这个对象someService已经不是原始的一个业务实现的功能，而是加入切面功能的对象
         */
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        String s = someService.doSome("zhangsan", 22);
        System.out.println("在测试方法中，目标方法的返回值" + s);

        /** 输出结果：显示改变了返回值
         * 环绕通知中前置方法的实现。。。。。。
         * doSome业务方法被执行。。。。。zhangsan
         * 环绕通知中后置方法的实现。。。。。。
         * 在测试方法中，目标方法的返回值ABCD
         */
    }

}
