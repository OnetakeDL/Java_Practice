package com.DL.a02abstractdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Frog f = new Frog("Mr.Green", 1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.drink();
        f.eat();
    }
}
