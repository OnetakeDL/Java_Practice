package com.DL.a02interfacedemo2;

//接口没有构造方法!
public interface Inter {
    //默认用public static final修饰成员变量
    //成员变量只能是常量
    int a = 10;

    //默认用public abstract修饰成员方法
    void method();
}
