package com.DL.a05interfacedemo5;

public class BasketballAthlete extends Athlete {

    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("The basketball athlete is studying basketball...");
    }
}
