command + option + T : surround with开启
implement:实现

总共有四个版本的AOP：
1）第一个版本：业务和切面紧耦合在一起，没有拆分

2）第二个版本：使用子类代理的方式拆分业务和切面

3）第三个版本：使用静态代理拆分业务和切面。业务和业务接口已拆分。此时切面紧耦合在业务中。
![截屏2022-04-25 21.03.25](/Users/jiaohailong/Library/Application Support/typora-user-images/截屏2022-04-25 21.03.25.png)
4）第四个版本：使用静态代理拆分业务和业务接口，切面和切面接口。
![截屏2022-04-26 10.12.12](/Users/jiaohailong/Library/Application Support/typora-user-images/截屏2022-04-26 10.12.12.png)
5）第五个版本：使用动态代理完成第四个版本的优化。