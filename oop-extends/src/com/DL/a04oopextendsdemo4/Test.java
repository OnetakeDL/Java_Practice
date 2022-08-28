package com.DL.a04oopextendsdemo4;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Ye {
    String name = "Ye";
}

class Fu extends Ye {
    String name = "Fu";
}

class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        String name = "ZiShow";
        System.out.println(name);//ZiShow(就近原则)
        System.out.println(this.name);//Zi
        System.out.println(super.name);//Fu
    }
}
