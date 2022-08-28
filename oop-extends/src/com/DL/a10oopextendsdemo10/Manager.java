package com.DL.a10oopextendsdemo10;

public class Manager extends Employee {

    private double bonus;

    //空参构造
    public Manager() {
    }

    //全参数构造
    //父类 + 子类
    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);//调用父类构造器
        this.bonus = bonus;//子
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("The manager is managing employees...");
    }
}
