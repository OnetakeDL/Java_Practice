package com.DL.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        //创建对象,赋初始值,调用方法
        Manager m = new Manager("DownBlock001", "DL", 14000, 6000);
        System.out.println("ID: " + m.getId() + "  " + "Name: " + m.getName());
        System.out.println("Salary: " + m.getSalary() + "  " + "Bonus: " + m.getBonus());
        m.work();
        m.eat();

        Chef c = new Chef();
        c.setId("DownBlock002");
        c.setName("Jason");
        c.setSalary(8000);
        System.out.println("ID: " + c.getId() + "  " + "Name: " + c.getName());
        System.out.println("Salary: " + c.getSalary());
        c.work();
        c.eat();
    }
}
