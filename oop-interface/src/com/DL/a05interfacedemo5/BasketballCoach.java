package com.DL.a05interfacedemo5;

public class BasketballCoach extends Coach {

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("The basketball coach is teaching basketball...");
    }
}
