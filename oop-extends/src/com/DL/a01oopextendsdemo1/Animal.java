package com.DL.a01oopextendsdemo1;

public class Animal {

    //权限修饰符:
    //private:子类就无法访问了
    //private:只能在本类中访问
    //爸爸的私房钱(只有自己能用)

    //注意事项:
    //子类只能访问父类中 *非私有* 的成员
    public void eat() {
        System.out.println("Eating...");
    }

    public void drink() {
        System.out.println("Drinking...");
    }
}
