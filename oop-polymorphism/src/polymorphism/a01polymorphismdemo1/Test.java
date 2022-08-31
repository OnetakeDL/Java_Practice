package polymorphism.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法
        Student s = new Student();
        s.setName("Max");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("Mr.Lian");
        t.setAge(30);

        Administrator admin = new Administrator();
        admin.setName("Director Lian");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);
    }

    //这个方法既能接收老师对象，又能接收学生对象，还能接收管理员对象
    //只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.showInfo();
    }
}
