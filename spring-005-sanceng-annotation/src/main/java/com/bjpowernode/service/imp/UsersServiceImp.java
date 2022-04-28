package com.bjpowernode.service.imp;

import com.bjpowernode.dao.UsersMapper;
import com.bjpowernode.dao.UsersMpperImp;
import com.bjpowernode.projo.Users;
import com.bjpowernode.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 11:09
 * 业务逻辑层的实现类
 */
@Service    // 交给Spring去创建对象
public class UsersServiceImp implements UsersService {

    // 所有的业务逻辑层中想要用数据访问（dao）层的数据必须有数据访问层的对象（数据在各层之间通过对象传递）
    @Autowired  // 使用Spring容器扫描注入 这里是按类型进行注入 从整个Bean工厂中搜索同源类型的对象进行注入
    private UsersMapper usersMapper; // = new UsersMpperImp();

    // 交给Spring去注入值，必须提供setXXX方法
    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }


}
