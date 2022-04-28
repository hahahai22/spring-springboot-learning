package com.bjpowernode.vo;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/22 19:40
 */
public class Phone {

    private String name;
    private String color;
    private Integer num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", num=" + num +
                '}';
    }
}
