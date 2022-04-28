package com.proxy4;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/26 10:28
 */
public class TransAOP implements AOP {

    @Override
    public void before() {
        System.out.println("事务开启。。。。");
    }

    @Override
    public void after() {
        System.out.println("事务提交。。。。");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚。。。。");
    }
}
