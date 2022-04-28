package com.bjpowernode.vo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/24 15:30
 * extends表示前面的类是后面的类的子类
 */
@Component("schoolZi")
public class SubSchool extends School {
    @Value("清华附小")
    private String name;
    @Value("海淀小区 ")
    private String address;

    public SubSchool() {
        System.out.println("SubSchool的无参构造方法");
    }

    @Override
    public String toString() {
        return "SubSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
