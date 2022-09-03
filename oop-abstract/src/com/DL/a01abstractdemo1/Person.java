package com.DL.a01abstractdemo1;

//抽象类不能实例化
public abstract class Person {
    private String name;
    private int age;

    //抽象类作为父类，也要把子类共有的属性抽取出来
    //抽象类里构造器的作用：当创建子类对象的时，给属性进行赋值
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //没有具体的方法体
    public abstract void work();

    //抽象类中可以有正常方法
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
