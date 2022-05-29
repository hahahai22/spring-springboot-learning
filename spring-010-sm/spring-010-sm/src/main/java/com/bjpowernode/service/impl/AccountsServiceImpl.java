package com.bjpowernode.service.impl;

import com.bjpowernode.pojo.Accounts;
import com.bjpowernode.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/29 15:03
 */
@Service  // 交给Spring容器去创建对象
public class AccountsServiceImpl implements AccountsService {

    // 切记：逻辑访问层必须有数据访问层的对象
    @Autowired      // 交给Spring依赖自动注入（值）
    AccountsService accountsService;

    @Override
    public int save(Accounts accounts) {
        return 0;
    }
}
