package org.example.modules;

public class Accumul {

    public static String accum(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    str += Character.toUpperCase(c);
                } else {
                    str += Character.toLowerCase(c);
                }
            }

            str += "-";
        }

        return str.substring(0, str.length() - 1) ;
    }
}