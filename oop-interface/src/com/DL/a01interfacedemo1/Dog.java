package com.DL.a01interfacedemo1;

public class Dog extends Animal implements Swim {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating bones...");
    }

    @Override
    public void swim() {
        System.out.println("The dog is swimming...");
    }
}
