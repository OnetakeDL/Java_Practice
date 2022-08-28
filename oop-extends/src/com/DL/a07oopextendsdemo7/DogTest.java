package com.DL.a07oopextendsdemo7;

public class DogTest {
    public static void main(String[] args) {
        //创建对象并调用
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.watchHome();
        h.breakHome();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.watchHome();

        SharPei sp = new SharPei();
        sp.eat();
    }
}
