package org.example;

import org.example.module.Worker;

import java.sql.Array;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int a1 = 10;
        int a2 = 10;

        String eq = a1 == a2 ? "ДА" : "НЕТ";
        System.out.println(eq);

        Worker w = new Worker();

        w.firstName = "Oleksandr";
        w.lastName = "Karadiaur";
        w.age = 19;
        w.salary = 10000;
        w.date = LocalDate.of(2004, 2, 3);

        w.setAge(20);

        System.out.println("Name: " + w.firstName);
        System.out.println("Lastname: " + w.lastName);
        System.out.println("Age: " + w.age);
        System.out.println("Salary: " + w.salary);
        System.out.println("Date (y-m-d): " + w.date);

        String helloMessage = w.sayHello();
        System.out.println(helloMessage);
    }

}