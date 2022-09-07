package com.DL.a04innerclassdemo4;

public class Test {
    public static void main(String[] args) {
        //注意事项：
        //1.静态内部类也是成员内部类中的一种
        //2.静态内部类只能访问外部类中的静态变量和静态方法
        //如果想要访问非静态的，需要创建外部类的对象

        //创建静态内部类对象的格式：
        //外部类名.内部类名 对象名 = new 外部类名.内部类名();
        //调用静态方法的格式：
        //外部类名.内部类名.方法名();

        //先创建静态内部类的对象
        Outer.Inner oi = new Outer.Inner();
        //再调用静态内部类里的非静态方法
        oi.show1();

        //只要是静态的东西，都可以用[类名.]直接调用
        //调用静态内部类里的静态方法
        Outer.Inner.show2();
    }
}
