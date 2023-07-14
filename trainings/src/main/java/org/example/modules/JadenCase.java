package org.example.modules;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        }

        int stringIndex = 0;
        StringBuilder newPhrase = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);

            if (c != ' ') {
                if (stringIndex == 0) {
                    newPhrase.append(Character.toUpperCase(c));
                } else {
                    newPhrase.append(Character.toLowerCase(c));
                }


                stringIndex++;

            } else {
                stringIndex = 0;
                newPhrase.append(Character.toUpperCase(' '));
            }
        }

        return newPhrase.toString();
    }

}