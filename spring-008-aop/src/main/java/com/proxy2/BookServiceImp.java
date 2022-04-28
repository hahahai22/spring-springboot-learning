package com.proxy2;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/25 20:40
 * 第二种版本：使用子类代理的方式拆分图书购买业务和事务切面
 */
public class BookServiceImp {
    // 父类中只有真正的业务
    public void buy(){
        System.out.println("图书购买业务实现。。。");
    }
}
