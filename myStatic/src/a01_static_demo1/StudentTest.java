package a01_static_demo1;

public class StudentTest {
    public static void main(String[] args) {
        // 1.create the first Student object
        // use ClassName.staticVariable to set the static variable
        Student.teacherName = "Ricky";
        Student s1 = new Student();
        s1.setName("DL");
        s1.setAge(21);
        s1.setGender("Male");
        //s1.teacherName = "Ricky";

        s1.study();
        s1.showInfo();

        // 2.create the second Student object
        Student s2 = new Student();
        s2.setName("LD");
        s2.setAge(20);
        s2.setGender("Female");

        s2.study();
        s2.showInfo();
    }
}
