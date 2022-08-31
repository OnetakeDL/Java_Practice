package polymorphism.a01polymorphismdemo1;

public class Student extends Person {
    @Override
    public void showInfo() {
        System.out.println("学生的信息为：" + getName() + ", " + getAge());
    }
}
