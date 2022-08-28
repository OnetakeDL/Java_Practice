package com.DL.a07oopextendsdemo7;

public class SharPei extends Dog {
    //因为沙皮狗吃狗粮和骨头
    //父类中的方法不能满足子类需求，所以需要进行重写
    @Override
    public void eat() {
        super.eat();
        System.out.println("SharPei is eating bones...\n");
    }
}
