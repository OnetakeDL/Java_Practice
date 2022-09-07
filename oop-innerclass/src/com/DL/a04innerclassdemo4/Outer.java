package com.DL.a04innerclassdemo4;

//静态内部类是一种特殊的成员内部类
public class Outer {

    int a = 10;
    static int b = 20;

    //静态内部类
    static class Inner1 {
        public void show() {
            //通过对象才能调用非静态的成员变量
            Outer outer = new Outer();
            System.out.println(outer.a);
            //静态的成员变量可以直接访问
            System.out.println(b);
        }
    }

    //静态内部类
    static class Inner {
        public void show1() {
            System.out.println("非静态的方法被调用了");
        }

        public static void show2() {
            System.out.println("静态的方法被调用了");
        }
    }
}