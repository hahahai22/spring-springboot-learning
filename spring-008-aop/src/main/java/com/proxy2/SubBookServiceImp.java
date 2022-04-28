package com.proxy2;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/25 20:46
 * 子类就是代理类（代理事务）将父类的图书购买功能添加到事务切面
 */
public class SubBookServiceImp extends BookServiceImp{

    @Override
    public void buy() {
        try {
            // 事务切面
            System.out.println("事务开启。。。。");
            // 主业务实现
            super.buy();
            // 事务切面
            System.out.println("事务提交。。。。");
        } catch (Exception e) {
            System.out.println("事务回滚。。。。");
        }
    }
}
