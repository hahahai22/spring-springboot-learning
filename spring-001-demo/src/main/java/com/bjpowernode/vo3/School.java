package com.bjpowernode.vo3;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 16:48
 */
public class School {
    private String name;
    private String address;


    // 使用构造方法给创建好的成员变量注入值
    public School(String name1, String address1) {
        this.name = name1;
        this.address = address1;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
