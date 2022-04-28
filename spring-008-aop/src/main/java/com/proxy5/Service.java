package com.proxy5;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/25 21:05
 */
public interface Service {
    // 规定业务功能
    void buy();
    // 增加有参数有返回值的功能
    default String show(int age){return null;}  // 不想被所有的实现类实现，变成默认实现。
}
