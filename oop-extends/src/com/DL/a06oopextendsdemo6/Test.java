package com.DL.a06oopextendsdemo6;

public class Test {
    public static void main(String[] args) {
        OverseasStudent student = new OverseasStudent();
        student.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("Eating rice and dishes...");
    }

    public void drink() {
        System.out.println("Drinking water...");
    }
}

//留学生
class OverseasStudent extends Person {
    public void lunch() {
        this.eat();//吃意大利面
        this.drink();//喝凉水

        super.eat();//吃米饭，吃菜
        super.drink();//喝开水
    }

    //应用场景:当父类中方法，不能满足子类的需求时，就需要把此方法重写
    //注意:子类中重写的方法上面需要加上@override
    @Override
    public void eat() {
        System.out.println("Eating spaghetti...");
    }

    @Override
    public void drink() {
        System.out.println("Drinking cold water...");
    }

}

//正常学生
class Student extends Person {
    public void lunch() {
        //先在本类中查找eat和drink方法，有的话就会调用子类的
        //如果没有，就会调用从父类中继承下来的eat和drink方法
        this.eat();
        this.drink();

        //直接调用父类中的eat和drink方法
        super.eat();
        super.drink();
    }
}
