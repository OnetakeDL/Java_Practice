package com.DL.a08oopextendsdemo8;

public class Student extends Person {

    public Student() {
        //子类的构造方法中隐藏着super()去访问父类的无参构造
        super();
        System.out.println("Son class's constructor without parameter");
    }

    public Student(String name, int age) {
        //调用父类的构造器
        super(name, age);
    }
}
