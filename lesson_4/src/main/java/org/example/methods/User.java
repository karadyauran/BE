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
}
