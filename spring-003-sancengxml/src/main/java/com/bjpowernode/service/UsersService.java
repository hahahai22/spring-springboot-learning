package com.bjpowernode.service;

import com.bjpowernode.projo.Users;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 11:03
 */
public interface UsersService {
    // 业务逻辑层 的接口作用就是调用底层的数据访问层（dao层）的功能
    // 调用增加用户的功能
    int insert(Users users);
}
