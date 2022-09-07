package com.DL.a05innerclassdemo5;

public class Outer {

    int b = 20;

    public void show() {
        int a = 10;
        //局部内部类(在方法里面的类)
        class Inner {

            String name;
            int age;

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void method1() {
                System.out.println(a);//可以访问方法里的局部变量
                System.out.println(b);//可以访问外部类的成员变量
                System.out.println("局部内部类中的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类中的method2静态方法");
            }
        }
        //创建局部内部类的对象
        Inner i = new Inner();
        i.setName("DL");
        i.setAge(21);
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }
}
