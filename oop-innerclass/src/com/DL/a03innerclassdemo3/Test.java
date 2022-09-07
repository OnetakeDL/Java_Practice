package com.DL.a03innerclassdemo3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建内部类的对象，并调用show方法
        Outer.Inner oi = new Outer().new Inner();
        oi.show();

        //让程序不中止
        //Scanner sc = new Scanner(System.in);
        //sc.next();
    }
}
