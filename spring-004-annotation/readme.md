extends表示前面的类是后面的类的子类

MyTest03中的输出：
    School的无参构造方法   // 创建School对象的时候调用的构造方法
    School的无参构造方法   // 创建SubSchool对象的时候，默认调用父类的无参构造方法
    SubSchool的无参构造方法
    Student{name='李斯', age=27, school=School{name='清华大学', address='海淀区'}}