package com.itheima.codeblockdemo1;

public class Student1 {
    private String name;
    private int age;
    //构造代码块：
    //1.写在[成员位置]的代码块
    //2.作用：可以把多个构造方法中重复的代码抽取出来
    //3.执行时机：在创建本类对象的时候，会先执行构造代码块再执行构造方法
    //此技术渐渐淘汰了(不够灵活)
    {
        System.out.println("开始创建对象了");
    }

    //希望执行构造代码块
    public Student1() {
        System.out.println("空参构造");
    }

    //希望执行构造代码块
    public Student1(String name, int age) {
        System.out.println("有参构造");
        this.name = name;
        this.age = age;
    }

    //只有一个参数的构造方法，但是不想执行构造代码块，需要用其他办法解决
    public Student1(String name) {
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
