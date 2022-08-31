package polymorphism.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象（多态方式）
        //Fu f = new Zi();
        Animal a = new Dog();
        //调用成员变量：编译看左边，运行也看左边
        //编译看左边：使用javac命令编译代码时，会看左边的父类中有没有这个变量(name)
        //如果有，编译成功，如果没有，编译失败
        //运行也看左边：使用java命令运行代码时，实际获取的是左边父类中成员变量的值
        System.out.println(a.name);//Animal

        //调用成员方法：编译看左边，运行看右边
        //编译看左边：使用javac命令编译代码时，会看左边的父类中有没有这个方法
        //如果有，编译成功，如果没有，编译失败
        //运行看右边：使用java命令运行代码时，实际上运行的是子类中的方法
        a.show();///Dog --- show method

        //理解：
        //Animal a = new Dog();
        //用a去调用变量和方法
        //而a是Animal类型的，所以默认会从Animal这个类中去找

        //成员变量：在子类的对象中，会把父类的成员变量继承下来
        //在创建Dog对象时，会有父的name 和 子的name
        //用Animal类去调用name就会是父的name
        //成员方法：如果子类对方法进行了重写，在虚方法表中会把父类的方法给覆盖掉
    }
}

class Animal {
    String name = "Animal";

    public void show() {
        System.out.println("Animal --- show method");
    }
}

class Dog extends Animal {
    String name = "Dog";

    @Override
    public void show() {
        System.out.println("Dog --- show method");
    }
}

class Cat extends Animal {
    String name = "Cat";

    @Override
    public void show() {
        System.out.println("Cat --- show method");
    }
}