package com.proxy4;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/26 10:22
 */
public interface AOP {

    // 默认空实现，可以在实现类中不用全部实现这些方法，想实现几个，实现几个。
    default void before() {
    }

    default void after() {
    }

    default void exception() {
    }
}
