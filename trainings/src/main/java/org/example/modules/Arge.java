package org.example.modules;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int counter = 0;
        percent /= 100;
        while (p0 < p){
            System.out.println(p0 + p0 * percent + aug);
            p0 = (int) (p0 + p0 * percent + aug);
            counter++;
        }

        return counter;
    }
}