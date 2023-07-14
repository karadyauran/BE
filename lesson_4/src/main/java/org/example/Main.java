package org.example;

import org.example.methods.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("+------------+------------+-------------+------------+");
        System.out.printf("|%11s |%11s |%12s |%11s |", "Name", "Age", "Weigh", "Gender");
        System.out.println();
        System.out.println("+------------+------------+-------------+------------+");

        User user1 = new User("Sasha", 19, 80.2, 'M');

        System.out.printf("|%11s |%11s |%12s |%11s |",
                user1.getName(),
                user1.getAge(),
                user1.getWeigh(),
                user1.getGender()
        );
        System.out.println();
        System.out.println("+------------+------------+-------------+------------+");

        User user2 = new User("Oleksanfdffdfddr", 20, 85.2, 'M');

        System.out.printf("|%11s |%11s |%12s |%11s |",
                user2.getName(),
                user2.getAge(),
                user2.getWeigh(),
                user2.getGender()
        );
        System.out.println();
        System.out.println("+------------+------------+-------------+------------+");
    }
}