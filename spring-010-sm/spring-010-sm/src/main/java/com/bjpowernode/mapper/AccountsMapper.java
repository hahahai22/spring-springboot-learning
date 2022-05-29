package com.bjpowernode.mapper;

import com.bjpowernode.pojo.Accounts;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/29 14:54
 */
public interface AccountsMapper {
    // 增加账户（增删改就是返回受影响的行数）
    int save(Accounts accounts);
}
