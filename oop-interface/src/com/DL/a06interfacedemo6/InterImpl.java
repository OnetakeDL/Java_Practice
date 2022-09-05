package com.DL.a06interfacedemo6;

public class InterImpl implements InterA, InterB {
    @Override
    public void method() {
        System.out.println("实现类重写接口中的抽象方法");
    }

    //必须重写show()方法，因为多个接口中存在相同名字的默认方法
    @Override
    public void show() {
        System.out.println("实现类重写接口中的默认方法");
    }
}
