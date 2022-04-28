package com.bjpowernode.vo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 21:37
 */
@Component("schoolNew")  // 交给Spring去创建对象
public class School {
    @Value("清华大学")
    private String name;
    @Value("海淀区")
    private String address;

    public School() {   // 子类创建对象默认调用父类的无参构造方法
        System.out.println("School的无参构造方法");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
