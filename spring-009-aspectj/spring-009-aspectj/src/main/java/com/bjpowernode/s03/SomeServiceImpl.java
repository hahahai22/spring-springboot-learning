package com.bjpowernode.s03;

import org.springframework.stereotype.Service;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/26 15:45
 */
@Service
public class SomeServiceImpl implements SomeService{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务方法被执行。。。。。" + name);
        return "abcd";
    }
}
