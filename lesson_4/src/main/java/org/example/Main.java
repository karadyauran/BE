package org.example;

import org.example.methods.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("+------------+------------+-------------+------------+");
        System.out.printf("|%11s |%11s |%12s |%11s |", "Name", "Age", "Weigh", "Gender");
        System.out.println();
        System.out.println("+------------+------------+-------------+------------+");

        User user1 = new User("Sasha", 19, 80.2, 'M');
        user1.makeTable();

        User user2 = new User("Oleksandr", 20, 85.2, 'M');
        user2.makeTable();

        User user3 = new User("Oleksandrianno", 20, 85.2, 'M');
        user3.makeTable();

        User user4 = new User("glkfhsdjghosfhghflshgkdnkgnldfjklgjdlk", 20, 85.2, 'M');
        user4.makeTable();
    }
}