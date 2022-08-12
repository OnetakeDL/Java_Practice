package a03_static_demo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //1.create a set(ArrayList) to store Student objects
        ArrayList<Student> list = new ArrayList<>();

        //2.create 3 Student objects
        Student stu1 = new Student("DL", 21, "男");
        Student stu2 = new Student("Zeng", 20, "男");
        Student stu3 = new Student("Miley", 22, "女");

        //3.add the objects to the set(ArrayList)
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //4.call the method in StudentUtil Class
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
