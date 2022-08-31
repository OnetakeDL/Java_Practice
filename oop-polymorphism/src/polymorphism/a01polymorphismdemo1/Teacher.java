package polymorphism.a01polymorphismdemo1;

public class Teacher extends Person {
    @Override
    public void showInfo() {
        System.out.println("老师的信息为：" + getName() + ", " + getAge());
    }
}
