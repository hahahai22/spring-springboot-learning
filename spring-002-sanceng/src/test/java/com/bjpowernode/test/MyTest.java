package com.bjpowernode.test;

import com.bjpowernode.controller.UsersController;
import com.bjpowernode.projo.Users;
import org.junit.Test;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 11:41
 */
public class MyTest {

    @Test
    public void test() {
        // 创建谁的对象？创建UsersController对象
        UsersController usersController = new UsersController();
        int num = usersController.insert(new Users(31341, "张三",27));
        System.out.println(num);
    }
}
