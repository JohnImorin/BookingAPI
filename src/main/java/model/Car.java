package model;

import java.util.UUID;

public class Car {


    private final UUID id;
    private final UUID Customerid;
    private final String brand;
    private final int plateNumber;
    private final String model;

    public Car(UUID id, UUID customerid, String brand, int plateNumber, String model) {
        this.id = id;
        Customerid = customerid;
        this.brand = brand;
        this.plateNumber = plateNumber;
        this.model = model;
    }

    public UUID getId() {
        return id;
    }

    public UUID getCustomerid() {
        return Customerid;
    }

    public String getBrand() {
        return brand;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return model;
    }
}