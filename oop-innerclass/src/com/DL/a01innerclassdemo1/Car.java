package com.DL.a01innerclassdemo1;

public class Car {

    String carName;
    int carAge;
    String carColor;

    //方法的参数里有一个隐藏的this
    //此方法被调用的时候
    //虚拟机会把调用者的地址值赋值给此处的this
    public void show(Car this) {
        //打印调用者的车的名字：唐
        System.out.println(this.carName);
        //创建内部类的对象
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    //内部类
    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
