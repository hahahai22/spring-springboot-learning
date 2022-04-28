package com.proxy4;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/26 10:31
 */
public class Agent implements Service {

    // 通过成员变量的方法传入目标（业务）对象
    public Service target;
    public AOP aop;

    // 使用构造方法初始化业务对象和切面对象
    public Agent(Service target, AOP aop) {
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy() {
        try {
            // 切面
            aop.before();  // 事务/日志
            // 业务
            target.buy(); // 商品/图书
            // 切面
            aop.after();  // 事务
        } catch (Exception e) {
            // 切面
            aop.exception(); // 事务
        }

    }
}
