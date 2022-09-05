package com.DL.a07interfacedemo7;

public interface Inter {
    //Inter接口中的抽象方法
    public abstract void method();

    //静态方法不需要重写，也无法重写
    public static void show() {
        System.out.println("Inter接口中的静态方法");
    }
}
