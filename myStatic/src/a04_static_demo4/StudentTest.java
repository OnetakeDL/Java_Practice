package a04_static_demo4;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "Mr.Tree";

        Student s1 = new Student();
        System.out.println("The address of s1: " + s1);
        s1.name = "Teleporter";
        s1.age = 16;
        s1.show1();

        System.out.println("=======================");

        Student s2 = new Student();
        System.out.println("The address of s2: " + s2);
        s2.name = "Play boy X";
        s2.age = 15;
        s2.show1();
    }
}
