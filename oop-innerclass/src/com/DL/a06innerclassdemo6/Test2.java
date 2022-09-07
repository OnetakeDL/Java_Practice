package com.DL.a06innerclassdemo6;

public class Test2 {
    //在方法外的(main方法)是一个没有名字的[成员内部类]
    //实现了Swim接口
    Swim s = new Swim() {
        @Override
        public void swim() {
            System.out.println("重写之后游泳方法");
        }
    };

    //在方法内的(main方法)是没有名字的[局部内部类]
    public static void main(String[] args) {
        //回顾一下匿名内部类的格式
        /*
                    new 类/接口() {
                        重写的方法;
                    };
        */

        //等号左边是接口
        //等号右边整体可以理解为Swim接口的实现类对象
        //形成了接口多态
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        };
        //编译看左边，运行看右边的原则
        s.swim();

        //整体作为一个对象，可以调用对象里面的方法
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        }.swim();
    }
}
