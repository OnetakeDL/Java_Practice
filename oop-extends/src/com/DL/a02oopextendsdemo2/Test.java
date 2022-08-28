package com.DL.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        //用空参构造创建子类对象
        Son son1 = new Son();

        //用带参构造创建子类对象
        //Son son2 = new Son("Teleporter",16);
    }
}


class Father {
    String name;
    int age;

    public Father() {
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Son extends Father {
    //如果一个类中没有构造方法，虚拟机会自动添加一个默认的空参构造
}
