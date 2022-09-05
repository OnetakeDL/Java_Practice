package com.DL.a05interfacedemo5;

//因为直接创建顶层父类Person的对象是没有意义的
//不想让外界直接创建Person的对象
//所以就把Person类写为抽象的
public abstract class Person {
    private String name;
    private int age;

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
}
