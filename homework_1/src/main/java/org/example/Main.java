package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char v1 = 'G';
        int v2 = 4;
        short v3 = 56;
        float v4 = 4.7333436F;
        double v5 = 4.355453532;
        long v6 = 12121;

        System.out.println("char: " + v1);
        System.out.println("int: " + v2);
        System.out.println("short: " + v3);
        System.out.println("float: " + v4);
        System.out.println("double: " + v5);
        System.out.println("long: " + v6);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Напишите 3-х значное число: ");
        int num = scanner.nextInt();

        int fNum = num / 100;
        int sNum = (num / 10) % 10;
        int tNum = num % 10;

        System.out.println("Число " + num + " -> " + fNum + ", " + sNum + ", " + tNum);
    }
}