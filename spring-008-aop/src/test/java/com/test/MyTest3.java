package com.test;

import com.proxy3.Agent;
import com.proxy3.ProductServiceImp;
import com.proxy3.Service;
import org.junit.Test;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/25 20:57
 */
public class MyTest3 {
    @Test
    public void test03() {
        // 可以灵活切换目标对象（相应的业务）
        Service agent = new Agent(new ProductServiceImp());
        agent.buy();

    }
}
