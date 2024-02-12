package com.teachmeskills.lesson9.task3.model.card;

public abstract class BaseCard {
    private long cardNumber;
    private int CVV;
    private double amount;
    private int id;
    private int currencyCode;
    private double commission;
    abstract public int getTransferLimit();

    public BaseCard(long cardNumber, int CVV, double amount, int id) {
        this.cardNumber = cardNumber;
        this.CVV = CVV;
        this.amount = amount;
        this.id = id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
