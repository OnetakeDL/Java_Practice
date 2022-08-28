package com.DL.a09oopextendsdemo9;

public class Student {
    String name;
    int age;
    String school;

    //需求：
    //使用无参构造器时,默认设置为下角大学

    public Student() {
        //this()表示调用本类其他构造方法
        //细节:这种方式虚拟机就不会再自动添加super()
        this(null, 18, "下角大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
