package com.proxy3;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/25 21:15
 * 静态代理已经实现了目标对象的灵活切换
 * 图书购买业务、商品购买业务。。。 的切换
 */
public class Agent implements Service{

    // 设计目标对象的类型为接口，为了灵活切换目标对象
    // 通过成员变量的方式将对象传进来
    public Service target;

    // 使用构造方法传入目标对象
    public Agent(Service target) {
        this.target = target;
    }

    @Override
    public void buy() {
        try {
            // 切面功能
            System.out.println("事务开启。。。。");     // 这里绑定的是事务的切片；也可以有日志、权限验证等切面
            // 业务功能
            target.buy();
            // 切面功能
            System.out.println("事务提交。。。。");
        } catch (Exception e) {
            System.out.println("事务回滚。。。。 ");
        }

    }
}
