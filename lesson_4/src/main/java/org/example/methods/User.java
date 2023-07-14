package org.example.methods;

public class User {
    String name;
    int age;
    double weigh;
    char gender;

    public User(String name, int age, double weigh, char gender){
        this.name = setName(name);
        this.age = age;
        this.weigh = weigh;
        this.gender = gender;
    }

    public String setName(String name){
        if (name.length() > 9){
            return name.substring(0 , 8) + "...";
        }

        return name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeigh() {
        return this.weigh;
    }

    public char getGender() {
        return this.gender;
    }

    public void makeTable(){
        System.out.printf("|%11s |%11s |%12s |%11s |",
                this.name,
                this.age,
                this.weigh,
                this.gender
        );
        System.out.println();
        System.out.println("+------------+------------+-------------+------------+");

    }
}
