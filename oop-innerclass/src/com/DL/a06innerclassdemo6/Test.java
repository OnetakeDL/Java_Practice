package com.DL.a06innerclassdemo6;

//匿名内部类包含了继承或实现、方法重写、创建对象
//当方法的参数是接口或者类时，就可以使用匿名内部类
//以接口为例，可以传递这个接口的实现类对象
public class Test {

    public static void main(String[] args) {
       /*
                需要理解匿名内部类的格式，而不是硬记：
                new 类名或者接口名() {
                 此处重写方法;
                };
       */

        //编写匿名内部类的代码
        //大括号包含的就是没有名字的内部类
        //实现了Swim()接口
        //new创建了对象
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        //继承Animal()类
        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        //如何在测试类中调用下面的method()方法?
        //以前的方式如何调用?
        //要写一个子类继承Animal类
        //再创建子类的对象，传递给method方法
        /*
        Dog d = new Dog();
        method(d);
        */
        //如果Dog类只用一次，那么还需要单独定义一个类太麻烦了

        //通过匿名内部类方式作为参数调用method()方法
        method(
                //创建Animal子类的对象作为方法method()的参数
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("The dog is eating bones...");
                    }
                }
        );
    }

    //Animal a = 子类对象(多态)
    //编译看左边，运行看右边
    public static void method(Animal a) {
        a.eat();
    }
}