package a01_static_demo1;

public class Student {
    private String name;
    private String gender;
    private int age;
    public static String teacherName;

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //behavior
    public void study() {
        System.out.println(name + " is studying.");
    }

    public void showInfo() {
        System.out.println(name + ", " + age + ", "
                + gender + ", " + teacherName);
    }
}
