package org.example.methods;

public class UserPrinter {
    public static String print(User user) {
        return String.format("|%11s |%11s |%12s |%11s |",
                user.name,
                user.age,
                user.weigh,
                user.gender);
    }
}
