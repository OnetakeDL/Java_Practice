package com.DL.test1;

public class Test {
    public static void main(String[] args) {
        /*
            final修饰方法：
                表明该方法是最终方法，不能被重写
            final修饰类：
                表明该类是最终类，不能被继承
            final修饰变量：
                 叫做常量，只能被赋值一次
        */
        final int a = 10;
        System.out.println(a);
        //a = 20;会报错
    }
}

final class Fu {
    public void show() {
        System.out.println("父类的show方法");
    }
}
/*
Zi无法继承Fu类，因为Fu类是final的
class Zi extends Fu{

}*/
