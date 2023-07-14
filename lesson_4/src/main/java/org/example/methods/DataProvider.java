package org.example.methods;

import java.util.Scanner;

public class DataProvider {
    public static Scanner scanner = new Scanner(System.in);

    public static User getUserFromTerminal() {
        System.out.print("name: ");
        String name = scanner.next();

        System.out.print("age: ");
        int age = scanner.nextInt();

        System.out.print("weigh: ");
        double weigh = scanner.nextDouble();

        System.out.print("gender: ");
        String gender = scanner.next();

        User user = new User(
                name,
                age,
                weigh,
                Character.toUpperCase(gender.charAt(0)));
        return user;
    }
}
