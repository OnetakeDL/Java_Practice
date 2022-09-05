package com.DL.a07interfacedemo7;

public class InterImpl implements Inter {
    @Override
    public void method() {
        System.out.println("InterImpl重写了接口里的抽象方法");
    }

    //这不是重写，只是在此实现类中，有一个跟接口里的方法重名的方法而已
    public static void show() {
        System.out.println("InterImpl没有重写抽象方法");
    }
}
