package org.example.modules;

public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0){
            s += "_";
        }

        int counter = 0;
        String[] result = new String[s.length() / 2];

        for(int i = 1; i < s.length(); i += 2){
            result[counter] = String.valueOf(s.charAt(i - 1)) + String.valueOf(s.charAt(i));
            counter++;
        }

        return result;
    }
}
