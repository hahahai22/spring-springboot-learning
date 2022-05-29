package com.bjpowernode.s02;

import org.springframework.stereotype.Service;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/26 09:04
 */
@Service
public class SomeServiceImpl implements SomeService{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务方法（目标方法）的实现(被执行)。。。。。  ");
        return "abcd";
    }

    @Override
    public Student change() {
        System.out.println("change方法被执行。。。。。");
        // System.out.println(1/0);  测试后置通知是否可以始终被执行（目标方法被执行，后置方法被炸掉）
        return new Student("李四");
    }
}
