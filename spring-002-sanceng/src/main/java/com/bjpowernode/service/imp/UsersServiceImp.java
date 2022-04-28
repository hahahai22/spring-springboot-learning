package com.bjpowernode.service.imp;

import com.bjpowernode.dao.UsersMapper;
import com.bjpowernode.dao.UsersMpperImp;
import com.bjpowernode.projo.Users;
import com.bjpowernode.service.UsersService;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 11:09
 * 业务逻辑层的实现类
 */
public class UsersServiceImp implements UsersService {

    // 所有的业务逻辑层中想要用数据访问（dao）层的数据必须有数据访问层的对象（数据在各层之间通过对象传递）
    private UsersMapper usersMapper = new UsersMpperImp();

    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
