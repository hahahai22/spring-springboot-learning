package com.proxy3;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/25 21:08
 * 目标对象：业务功能的具体实现
 */
public class BookServiceImp implements Service{
    // 实现接口中的业务功能
    @Override
    public void buy() {
        System.out.println("图书购买功能的实现。。。");
    }
}
