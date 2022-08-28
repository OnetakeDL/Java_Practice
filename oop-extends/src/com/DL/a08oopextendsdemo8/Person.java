package com.DL.a08oopextendsdemo8;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("Super class's constructor without parameter");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
