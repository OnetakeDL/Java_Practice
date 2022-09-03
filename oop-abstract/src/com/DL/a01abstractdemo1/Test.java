package com.DL.a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //Person p = new Person();

        //创建子类对象
        Student s = new Student("DL", 21);

        System.out.println(s.getName() + ", " + s.getAge());
    }
}
