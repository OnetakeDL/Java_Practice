package com.DL.a07oopextendsdemo7;

public class ChineseDog extends Dog {
    //父类中的方法不能满足子类的需求，所以需要进行重写
    //而且中华田园犬完全用不到父类中的代码，所以不需要通过super进行调用
    @Override
    public void eat() {
        System.out.println("The Chinese dog is eating those left food...\n");
    }
}
