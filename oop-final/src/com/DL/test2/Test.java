package com.DL.test2;

public class Test {
    public static void main(String[] args) {
        /*
            final修改基本数据类型：记录的值不能发生改变
            final修饰引用数据类型：记录的地址值不能发生改变，内部的属性值还是可以改变的

            核心：常量记录的数据是不能发生改变的

            提示：字符串是不可变的
        */

        //圆周率是固定的
        final double PI = 3.14;

        //创建对象
        final Student S = new Student("Janna", 23);
        //记录的地址值不能发生改变，但对象内部的属性值还是可以改变的
        //S = new Student();给S一个新的地址值，会报错
        S.setName("Van");
        S.setAge(24);
        System.out.println(S.getName() + ", " + S.getAge());

        //数组(引用数据类型)
        final int[] ARR = {1, 2, 3, 4, 5};
        //ARR = new int[10];给ARR一个新的地址值，会报错
        //可以修改对象内部属性值
        ARR[0] = 10;
        ARR[1] = 20;

        //遍历数组，查看数组里存放的值
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}
