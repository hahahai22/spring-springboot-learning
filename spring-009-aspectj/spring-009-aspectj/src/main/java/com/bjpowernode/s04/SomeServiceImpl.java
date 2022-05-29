package com.bjpowernode.s04;

import org.springframework.stereotype.Service;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/26 15:45
 * 测试最终通知是否在任何情况下都会被执行
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务方法被执行。。。。。" + name);
        // System.out.println(1/0);    // 试一下这个，看最终通知是否执行。
        return "abcd";
    }
}
