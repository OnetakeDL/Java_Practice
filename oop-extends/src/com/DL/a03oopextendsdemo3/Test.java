package com.DL.a03oopextendsdemo3;

import java.io.IOException;

//内存分析过程(不需要掌握)
//子类可以继承父类的成员变量,不管是否私有
public class Test {
    public static void main(String[] args) throws IOException {
        /* Zi z = new Zi();
        z.fuShow1();
        */

        //把对象的地址值z以16进制的形式打印在控制台上
        //System.out.println(Long.toHexString(VM.current().addressOf(z)));

        //添加获取键盘输入代码,是因为内存分析工具需要程序不停止
        //Scanner sc = new Scanner(System.in);
        //sc.next();
    }
}


class Fu {
    private int a = 0x111;
    int b = 0x222;

    public void fuShow1() {
        System.out.println("public --- FuShow");
    }

    private void fuShow2() {
        System.out.println("private --- FuShow");
    }
}

class Zi extends Fu {
    int c = 0x333;

    public void ziShow() {
        System.out.println("public --- ZiShow");
    }
}

