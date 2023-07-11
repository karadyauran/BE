package org.example;

import org.example.module.Car;
import org.example.module.Worker;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int a1 = 10;
        int a2 = 10;

        String eq = a1 == a2 ? "ДА" : "НЕТ";
        System.out.println(eq);

        Worker w = new Worker();

        w.id = 90343458;
        w.firstName = "Oleksandr";
        w.lastName = "Karadiaur";
        w.age = 19;
        w.salary = 10000;
        w.date = LocalDate.of(2004, 2, 3);

        Car wCar = new Car();

        wCar.brand = "BMW";
        wCar.carName = "M5 F90";
        wCar.vin = "WBANJFLDF53940";
        wCar.owner = w;

        w.setAge(20);

        System.out.println("Name: " + w.firstName);
        System.out.println("Lastname: " + w.lastName);
        System.out.println("Age: " + w.age);
        System.out.println("Salary: " + w.salary);
        System.out.println("Date (y-m-d): " + w.date);

        String helloMessage = w.sayHello();
        System.out.println(helloMessage);

        if (w.returnPermission()) {
            System.out.println("Permission got");
        }
        System.out.println(" ");

        System.out.println("Brand: " + wCar.brand);
        System.out.println("Car name: " + wCar.carName);
        System.out.println("VIN: " + wCar.vin);
        System.out.println("Owner: " + wCar.owner.firstName);

        System.out.println(wCar.startEngine());
        System.out.println(wCar.stopEngine());
    }

}