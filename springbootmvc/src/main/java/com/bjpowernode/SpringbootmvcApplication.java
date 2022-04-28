package com.bjpowernode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootConfiguration
 * 使用这个注解标注的类，可以作为配置文件使用的，可以使用Bean声明对象，注入到容器中
 *
 * @EnableAutoConfiguration
 * 启用自动配置，将Java对象配置好，注入到容器中，例如，可以将mybatis的对象创建好，注入容器中
 *
 * @ComponentScan(
 *     excludeFilters = {@Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {TypeExcludeFilter.class}
 * ), @Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {AutoConfigurationExcludeFilter.class}
 * )}
 * )
 * 这个注解是一个扫描器，找到注解，根据注解
 *
 * public @interface SpringBootApplication {
 */
@SpringBootApplication
public class SpringbootmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmvcApplication.class, args);
    }

}
