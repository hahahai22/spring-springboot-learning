package com.bjpowernode.dao;

import com.bjpowernode.projo.Users;
import org.springframework.stereotype.Repository;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 10:55
 * 数据访问层的实现类
 */
@Repository // 交给Spring去创建对象
public class UsersMpperImp implements UsersMapper {

    // 实现接口中未被实现的方法
    @Override
    public int insert(Users u) {
        System.out.println(u.getUname() + "用户被增加成功");
        return 1;
    }
}
