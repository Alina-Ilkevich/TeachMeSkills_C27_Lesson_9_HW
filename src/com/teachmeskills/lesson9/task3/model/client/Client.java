package com.teachmeskills.lesson9.task3.model.client;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.task3.model.address.Address;

public class Client {
private String name;
private String surname;
private String passNumber;
private Address address;
private BaseCard[] cards;

    public Client(String name, String surname, String passNumber, Address address, BaseCard[] cards) {
        this.name = name;
        this.surname = surname;
        this.passNumber = passNumber;
        this.address = address;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = cards;
    }
}
