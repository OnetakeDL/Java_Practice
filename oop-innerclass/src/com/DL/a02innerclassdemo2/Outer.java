package com.DL.a02innerclassdemo2;

public class Outer {

    String name;

    //用private修饰的内部类
    private class Inner {
        static int a = 10;
    }

    //在外部类编写方法，对外提供内部类对象
    public Inner getInstance() {
        return new Inner();
    }
}
