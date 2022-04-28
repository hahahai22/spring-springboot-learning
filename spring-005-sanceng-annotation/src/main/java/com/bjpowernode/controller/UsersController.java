package com.bjpowernode.controller;

import com.bjpowernode.projo.Users;
import com.bjpowernode.service.UsersService;
import com.bjpowernode.service.imp.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 11:20
 * <p>
 * <p>
 * 界面层调用业务逻辑层，业务逻辑层调用数据访问层，数据访问层将数据插入到数据库中。环环相扣。
 * 界面层
 */
@Controller // 交给Spring去创建对象
public class UsersController {
    // 如何去访问业务逻辑层：创建对象
    // 切记切记：所有界面层都会有业务逻辑层的对象
    // 接口指向实现类
    @Autowired  // 在UsersServiceImp创建了UsersService对象，使用@Autowired注入这个创建的 对象
    public UsersService usersService;//= new UsersServiceImp();

    // 交给Spring去注入值必须提供setXXX方法
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    // 界面层的功能实现，对外提供访问的功能
    public int insert(Users users) {
        return usersService.insert(users);
    }

    }
