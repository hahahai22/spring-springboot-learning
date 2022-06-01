package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.UsersMapper;
import com.bjpowernode.pojo.Accounts;
import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.AccountsService;
import com.bjpowernode.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/28 19:05
 * 业务逻辑层
 */
@Service // 交给Spring容器去创建对象
public class UserServiceImpl implements UsersService {
    // 切记：在所有的业务逻辑层中一定有数据访问层的对象
    /**
     * 没有Spring的时候mybatis这样弄：
     * 1.读取核心配置文件
     * InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
     * 2.创建工厂对象
     * SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
     * 3.取出SqlSession
     * sqlSession = factory.openSession(true);
     * 4.取出动态代理的对象，完成接口中方法的调用，实则是调用xml文件中相应标签的功能。
     * uMapper = sqlSession.getMapper(UserMapper.class);
     */
    // 从业务逻辑层拿到数据访问层的对象，出现上面的不合适。使用下面的
    @Autowired // 交给Spring容器创建对象和依赖注入（赋值）
    UsersMapper usersMapper; // 这个对象Spring容器已经创建成功，这里拿来用。

    @Autowired
    AccountsService accountsService; // 这里的accountsService对象在AccountsServiceImpl.java文件中添加了注解@Service，
    // 已经由Spring容器创建成功，这里拿来用


    @Override
    public int insert(Users users) {

        int num = usersMapper.insert(users);
        System.out.println("用户增加成功！" + num);
        // 调用账户的增加操作，调用账户的业务逻辑层的功能。
        num = accountsService.save(new Accounts(400, "张三", "账户增加成功"));
        return num;
    }
}
