package com.DL.a05interfacedemo5;

public class PingpongAthlete extends Athlete implements SpeakEnglish {

    public PingpongAthlete() {
    }

    public PingpongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("The Pingpong athlete is studying Pingpong...");
    }

    @Override
    public void learnToSpeakEnglish() {
        System.out.println("The Pingpong athlete is learning to speak English...");
    }
}
