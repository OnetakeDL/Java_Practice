package com.DL.a10oopextendsdemo10;

public class Chef extends Employee {

    //空参构造
    public Chef() {
    }

    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("The chef is cooking...");
    }
}
