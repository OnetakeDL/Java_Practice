package com.DL.a02abstractdemo2;

public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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

    //每个动物都一样的共性方法
    public void drink() {
        System.out.println("The animal is drinking...");
    }

    //每个动物吃的都不一样，所以要用抽象方法
    //抽象方法强制子类必须按照这种格式进行重写
    public abstract void eat();
}
