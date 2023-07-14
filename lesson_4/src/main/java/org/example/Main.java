package org.example;

import org.example.methods.DataProvider;
import org.example.methods.User;
import org.example.methods.UserPrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of users: ");
        int count = scanner.nextInt();

        User[] users = new User[count];
        for (int i = 0; i < users.length; i++) {
            users[i] = DataProvider.getUserFromTerminal();
            System.out.println("------------------------------------------------------");
        }

        System.out.println("+------------+------------+-------------+------------+");
        System.out.printf("|%11s |%11s |%12s |%11s |", "Name", "Age", "Weigh",
                "Gender");
        System.out.println();
        System.out.println("+------------+------------+-------------+------------+");

        for (User user : users) {
            System.out.println(UserPrinter.print(user));
        }
        System.out.println("+------------+------------+-------------+------------+");
    }
}