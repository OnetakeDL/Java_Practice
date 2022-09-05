package com.DL.a06interfacedemo6;

public interface InterA {
     /*
     接口中默认方法的定义格式：
            格式：public default 返回值类型 方法名(参数列表) {   }

     接口中默认方法的注意事项：
            1.默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字
            2.public可以省略，default不能省略
            3.实现类如果实现了多个接口，多个接口中存在相同名字的默认方法，就必须对这些方法进行重写
     */

    //抽象方法
    public abstract void method();

    //默认方法，default不能少
    public default void show() {
        System.out.println("InterA接口中的默认方法 ---- show");
    }
}
