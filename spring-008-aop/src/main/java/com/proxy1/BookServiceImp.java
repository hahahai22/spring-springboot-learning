package com.proxy1;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/25 20:33
 * 第一个版本：图书购买业务和事务切面完全耦合在一起
 */
public class BookServiceImp {

    public void buy () {
        try {
            System.out.println("事务开启。。。。。。。");
            System.out.println("图书购买业务实现。。。");
            System.out.println("事务提交。。。。。。。");
        } catch (Exception e) {
            System.out.println("事务回滚。。。。。。。");      // 事务出错提供回滚功能
        }

    }
}
