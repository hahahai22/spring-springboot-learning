package com.test;

import com.proxy4.*;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/25 20:57
 */
public class MyTest4 {
    @Test
    public void test04() {
        // 可以灵活切换目标对象（相应的业务）
//        Service agent = new Agent(new BookServiceImp(), new LogAOP()); // 图书
        // 添加多个切面，层层切面
        Service agent = new Agent(new ProductServiceImp(), new TransAOP());  // 商品
        Service agent1 = new Agent(agent, new LogAOP());
        agent1.buy();



        /**
         * 输出：
         * 前置日志输出。。。。
         * 事务开启。。。。
         * 商品购买业务。。。。
         * 事务提交。。。。
         */
    }
}
