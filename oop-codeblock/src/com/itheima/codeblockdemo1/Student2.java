package com.itheima.codeblockdemo1;

//不使用构造代码块的解决方案
public class Student2 {
    private String name;
    private int age;

    public Student2() {
        //希望打印"开始创建对象了"，调用另一个构造方法
        this(null, 0);
    }

    public Student2(String name, int age) {
        System.out.println("开始创建对象了");
        this.name = name;
        this.age = age;
    }

    //只有一个参数的构造方法，但是不想打印"开始创建对象了"
    public Student2(String name) {
        //不写打印语句，也不调用其他构造方法
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
