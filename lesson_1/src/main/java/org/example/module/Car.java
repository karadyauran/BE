package org.example.module;

public class Car {
    public String brand;
    public String carName;
    public String vin;
    public Worker owner;

    public boolean startEnginePermission (int id) {
        if (id != this.owner.id) {
            return false;
        }

        return true;

    }
}
