package com.test;

import com.proxy5.BookServiceImp;
import com.proxy5.ProxyFactory;
import com.proxy5.Service;
import com.proxy5.TransAOP;
import org.junit.Test;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/27 16:05
 */
public class MyTest5 {

    @Test
    public void test04() {
        // 获取动态代理对象
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImp(), new TransAOP());
        // 使用对象
        agent.buy();
        /*
        事务开启。。。。
        图书购买功能的实现。。。
        事务提交。。。。
         */
    }

    @Test
    public void test05() {
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImp(), new TransAOP());
        String s = agent.show(22);
        System.out.println(s);
        /*
        事务开启。。。。
        show()方法传进去的参数：22
        事务提交。。。。
        这是show()方法的返回值
         */
    }
}

