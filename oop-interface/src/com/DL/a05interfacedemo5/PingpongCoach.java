package com.DL.a05interfacedemo5;

public class PingpongCoach extends Coach implements SpeakEnglish {

    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("The Pingpong coach is teaching Pingpong...");
    }

    @Override
    public void learnToSpeakEnglish() {
        System.out.println("The Pingpong coach is learning to speak English...");
    }
}
