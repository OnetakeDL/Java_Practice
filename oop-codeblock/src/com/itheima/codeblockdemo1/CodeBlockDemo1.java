package com.itheima.codeblockdemo1;

public class CodeBlockDemo1 {
    public static void main(String[] args) {
        /* 局部代码块(此技术已淘汰):
        {
            int a = 10;
        }//下面的打印语句会报错，因为当代码执行到这里时，变量a就从内存中消失了
        //System.out.println(a);
        */

        //创建对象
        Student1 s = new Student1();

        Student1 s2 = new Student1("K", 21);

        Student1 s3 = new Student1("DL");
    }
}
