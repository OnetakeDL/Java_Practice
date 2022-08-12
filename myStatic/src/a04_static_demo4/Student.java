package a04_static_demo4;

public class Student {
    String name;
    int age;
    static String teacherName;

    //this: stands for the address of current caller
    //this (this): is assigned by virtual machine
    public void show1(Student this) {
        System.out.println("The address of this: " + this);
        System.out.println(name + ", " + age + ", " + teacherName);

        //call other methods
        show2();
        method();
    }

    public void show2(){
        System.out.println("show2() is called");
    }

    public static void method() {
        System.out.println("A static method");
    }
}
