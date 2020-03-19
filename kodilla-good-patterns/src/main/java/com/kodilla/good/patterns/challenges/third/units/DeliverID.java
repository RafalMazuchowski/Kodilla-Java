package com.kodilla.good.patterns.challenges.third.units;

public class DeliverID {
    private String Name;
    private String Surname;
    private String Address;
    private String phoneNumber;

    public DeliverID(String name, String surname, String address, String phoneNumber) {
        Name = name;
        Surname = surname;
        Address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

