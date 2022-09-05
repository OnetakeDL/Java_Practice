package com.DL.a01interfacedemo1;

//兔子不会游泳，不需要实现游泳接口
public class Rabbit extends Animal {

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("The rabbit is eating carrots...");
    }
}
