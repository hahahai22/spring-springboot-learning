package com.bjpowernode.s01;

import org.springframework.stereotype.Service;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/25 15:41
 * 业务功能的实现
 */
@Service
public class SomeServiceImpl implements SomeService{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务功能的实现。。。。。。");
        return "abcd";
    }

    @Override
    public void show() {
        System.out.println("show业务功能的实现。。。。。。。");
    }
}
