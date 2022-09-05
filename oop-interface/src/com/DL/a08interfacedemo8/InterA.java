package com.DL.a08interfacedemo8;

public interface InterA {

    public default void show1() {
        System.out.println("show1方法开始执行了");
        show3();
    }

    public static void show2() {
        System.out.println("show2方法开始执行了");
        show4();
    }

    //普通的私有方法，是为[default方法]服务的
    private void show3() {
        System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
    }

    //静态的私有方法，是为[static方法]服务的
    private static void show4() {
        System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
    }
}
