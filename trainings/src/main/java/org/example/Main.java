package org.example;

import org.example.modules.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.println(Arge.nbYear(1500, 5, 100, 5000));
        // System.out.println(Accumul.accum("ZpglnRxqenU"));
        // System.out.println(Arrays.toString(StringSplit.solution("abcdef")));

//        JadenCase j = new JadenCase();
//
//        System.out.println(j.toJadenCase(null));

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        System.out.println(Arrays.toString(a));

        /*Scanner userData = new Scanner(System.in);

        System.out.print("Enter arr size: ");
        int size = userData.nextInt();

        System.out.print("Enter min value: ");
        int min = userData.nextInt();

        System.out.print("Enter max value: ");
        int max = userData.nextInt();

        int[] arr = new int[size];
        int index = 0;

        while (index < size) {
            int random = (int) (Math.random() * max) + min;
            arr[index] = random;
            // System.out.println(arr[index]);
            index++;
        }

//        1. о строках
//        2. Логика
//        3. Введение в ветвления
//        4. Введение в циклы
//        5. массивы

        String str = "Маша ела кашу";
        System.out.println(str);

        String str2 = new String("Маша ела кашу более правильно");
        System.out.println(str2);

        int count = str.length();
        System.out.println("length str2 = " + count);

        char firstChar = str.charAt(0); // первый символ строки
        System.out.println(firstChar);

        char lastChar = str.charAt(count - 1); // первый символ строки
        System.out.println(lastChar);

        String subStr1 = str.substring(4);
        String subStr2 = str.substring(4, 7);
        int ela = str.indexOf("ела");
        System.out.println(subStr1);
        System.out.println(subStr2);
        System.out.println(ela);

        // Логика

        boolean flag1 = true;
        boolean flag2 = false;

        int a = 1;
        int b = 2;
        boolean flag3 = a > b;
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        // Логические операции
        boolean flag4 = (a > b) && flag3; // AND Конъюнкция
        boolean flag5 = (a > b) || flag3; // OR  Дизъюнкция
        boolean flag6 = !flag5; // NOT EQUAL


        Scanner scanner = new Scanner(System.in);
        System.out.print("Print num: ");
        int x = scanner.nextInt();
        System.out.print("Print num: ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("Max = " + x);
        } else if (x < y) {
            System.out.println("Max = " + x);
        } else {
            System.out.println(y + " equal " + x);
        }

        // циклы

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // arrays

        int size = 10;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i * 2;
        }

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(Kata.flip('R', new int[]{1,4,5,3,5})));*/
    }
}