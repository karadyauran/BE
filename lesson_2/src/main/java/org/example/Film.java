package org.example;

public class Film {
    private static int globalId = 1;
    String title;
    public int id;

    public Film (String title){
        this.id = globalId;
        globalId++;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public int getId() {
        return this.id;
    }

    public String getInfo(){
        return "title: " + this.title + " id: " + this.id;
    }
}
