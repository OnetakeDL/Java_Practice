package com.DL.test;

//使用同一个包中的类时，不需要导包
//使用java.lang包中的类，不需要导包
//其他情况都需要导包
//如果同时使用两个包中的同名类，需要使用全类名
public class Test {
    public static void main(String[] args) {
        //创建对象
        /*
        Student s = new Student();
        s.setName("Fahrn");
        s.setAge(21);
        System.out.println(s.getName() + ", " + s.getAge());
        */

        /*
        String是java.lang包里的类，不需要导包
        String s = "abc";
        System.out.println(s);
        */

        //全类名形式
        com.DL.domain1.Teacher t1 = new com.DL.domain1.Teacher();
        com.DL.domain2.Teacher t2 = new com.DL.domain2.Teacher();
    }
}
