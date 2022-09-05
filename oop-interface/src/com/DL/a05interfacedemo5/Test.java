package com.DL.a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        PingpongCoach pingpongCoach = new PingpongCoach("刘国梁", 46);
        PingpongAthlete pingpongAthlete = new PingpongAthlete("马龙", 24);

        System.out.println(pingpongCoach.getName() + ", " + pingpongCoach.getAge());
        pingpongCoach.teach();
        pingpongCoach.learnToSpeakEnglish();

        System.out.println(pingpongAthlete.getName() + ", " + pingpongAthlete.getAge());
        pingpongAthlete.study();
        pingpongAthlete.learnToSpeakEnglish();
    }
}
