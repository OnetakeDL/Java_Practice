package com.DL.a09interfacedemo9;

//实现类
//万一此类需要继承某个类，让适配器类(中间类)去继承那个类即可
public class InterImpl extends InterAdapter {
    //需要用哪个方法，就重写哪个方法
    @Override
    public void method5() {
        System.out.println("只要使用第五个方法");
    }
}
