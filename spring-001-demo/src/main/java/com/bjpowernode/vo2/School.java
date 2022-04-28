package com.bjpowernode.vo2;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 09:20
 */
public class School {
    private String name;
    private String address;

    // 无参构造方法
    public School() {
        System.out.println("学校的无参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", add='" + address + '\'' +
                '}';
    }
}
