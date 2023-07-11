package org.example.module;

import java.time.LocalDate;

public class Worker {
    // поле
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
}
