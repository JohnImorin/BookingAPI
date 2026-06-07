package model;

import java.util.UUID;

public class Customer {


    private final UUID id;
    private final String fullname;
    private final int phoneNumber;
    private final String email;

    public Customer(UUID id, String fullname, int phoneNumber, String email) {
        this.id = id;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}