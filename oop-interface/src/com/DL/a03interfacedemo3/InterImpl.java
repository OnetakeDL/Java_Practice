package com.DL.a03interfacedemo3;

//在多个接口中，有重名的方法，只需要重写一次即可
public class InterImpl implements Inter1, Inter2 {

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    @Override
    public void method4() {
        System.out.println("method4");
    }
}
