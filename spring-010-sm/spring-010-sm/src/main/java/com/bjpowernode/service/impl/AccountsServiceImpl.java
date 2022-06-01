package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.AccountsMapper;
import com.bjpowernode.pojo.Accounts;
import com.bjpowernode.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/29 15:03
 */
@Service  // 交给Spring容器去创建对象
// 这里的propagation = Propagation.REQUIRED是事务的传播特性，增删改必须走这个特性。
// 指定发生什么异常事务不回滚。noRollbackForClassName使用的是异常的名称。
// noRollbackFor，使用的是异常的类型
// rollbackForClassName指定发生什么异常，必须回滚
// rollbackFor 指定发生什么异常类型，必须回滚
// timeOut=-1 默认是-1，表示永不超时
// readOnly 默认是false增删改操作，如果是查询操作，设置为true
// isolation=Isolation.DEFAULT 使用数据库自己默认的隔离级别 "数据库有四种隔离级别：读未提交、读已提交、可重复度、串行/序列化读"
//@Transactional(propagation = Propagation.REQUIRED, noRollbackForClassName = "ArithmeticException")
public class AccountsServiceImpl implements AccountsService {

    // 切记：逻辑访问层必须有数据访问层的对象
    @Autowired      // 交给Spring依赖自动注入（值）
    AccountsMapper accountsMapper;

    @Override
    public int save(Accounts accounts) {
        int num = 0;
        num = accountsMapper.save(accounts);
        System.out.println("账户增加成功num!：" + num);
        // 手动抛出异常
        System.out.println(1/0);
        return 0;
    }
}
