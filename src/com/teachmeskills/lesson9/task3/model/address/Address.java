package com.teachmeskills.lesson9.task3.model.address;

public class Address {
    private String Country;
    private String City;
    private String Street;
    private int houseNumber;
    private int index;

    public Address(String country, String city, String street, int houseNumber, int index) {
        Country = country;
        City = city;
        Street = street;
        this.houseNumber = houseNumber;
        this.index = index;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
