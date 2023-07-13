package org.example;


import java.util.Scanner;

public class Main {

    public void run(){
        System.out.println("run");
    }

    public static int sum (int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner userData = new Scanner(System.in);
        System.out.print("Enter film name: ");
        String fName = userData.nextLine();

        System.out.println(fName);

        Film f = new Film("hello");
        System.out.println(f.getInfo());

        Film f2 = new Film("Film 2");
        System.out.println(f2.getInfo());

        Film f3 = new Film("Film 3");
        System.out.println(f3.getInfo());
    }
}