package org.example.module;

import java.time.LocalDate;

public class Worker {
    // поле
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public double salary;
    public LocalDate date;

    // методы
    public void setAge(int age) {
        this.age = age;
    }

    public void seSalary (double salary) {
        this.salary = salary;
    }

    public String sayHello () {
        return "Hello, " + this.firstName;
    }

    public boolean returnPermission() {
        return this.age >= 18;
    }


}
