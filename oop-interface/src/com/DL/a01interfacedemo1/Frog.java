package com.DL.a01interfacedemo1;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("The frog is eating insects...");
    }

    @Override
    public void swim() {
        System.out.println("The frog is swimming...");
    }
}
