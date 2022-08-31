package polymorphism.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Animal a = new Dog();
        //调用成员方法:编译看左边，运行看右边
        //编译的时候先检查左边的父类里有没有eat()方法
        //代码实际执行时执行右边子类Dog()里面的eat()方法
        a.eat();

        //多态的弊端
        //不能调用子类的特有功能
        //a.lookHome()报错的原因:
        //调用成员方法的时候：编译看左边，运行看右边
        //那么在编译的时候会先检查左边的父类中有没有这个方法，如果没有直接报错
        //所以a.lookHome()会报错

        //解决方案：
        //把调用者(a)转回子类类型就可以了
        //细节：转换的时候不能乱转，如果转成其他类的类型，会报错
        //Cat c = (Cat)a; 狗不可以转成猫
        //c.catchMouse();

        //先做判断再转化类型
        /*
        if(a instanceof Dog){
            Dog d = (Dog) a;
            d.lookHome();
        }else if(a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }else{
            System.out.println("There is no such a type, unable to cast.");
        }
        */

        //JDK14新特性:
        //先判断a是否为Dog类型，如果是，则强转成Dog类型，转换之后变量名为d
        //如果不是，则不强转，结果直接是false
        if (a instanceof Dog d) {
            d.watchHouse();
        } else if (a instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("没有这个类型，无法转换");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("The animal is eating...");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating bone...");
    }

    //子类的特有方法
    public void watchHouse() {
        System.out.println("The dog is watching house...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating little dried fish...");
    }

    //子类的特有方法
    public void catchMouse() {
        System.out.println("The cat is catching mouse...");
    }
}