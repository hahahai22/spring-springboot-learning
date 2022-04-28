package com.proxy5;

import com.proxy4.AOP;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/26 10:27
 */
public class LogAOP implements AOP {

    @Override
    public void before() {
        System.out.println("前置日志输出。。。。");
    }
}
