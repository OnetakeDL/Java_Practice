package com.DL.a05oopextendsdemo5;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu {
    String name = "Fu";
    String hobby = "Drinking tea";

}

class Zi extends Fu {
    String name = "Zi";
    String game = "PUBG";

    public void show() {
        //如何打印Zi
        System.out.println(name);
        System.out.println(this.name);
        //如何打印Fu
        System.out.println(super.name);
        //如何打印Drinking tea
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);
        //如何打印PUBG
        System.out.println(game);
        System.out.println(this.game);
    }
}
