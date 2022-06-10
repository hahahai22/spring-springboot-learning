package com.bjpowernode;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/6/10 09:17
 * 主启动类
 */
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        // Ctrl + P 查看方法参数
        SpringApplication.run(MyApplication.class, args);
    }
}
