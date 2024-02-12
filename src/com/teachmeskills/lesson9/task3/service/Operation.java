package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;

public class Operation {
    //1. Почему на вход BaseCard? И что конкретно нужно передавать на вход в этот метод, когда его вызываешь
    //2. Не знаю, как использовать константы: как их привязать к конкретной карте.
    //Например, комиссия у каждой карты будет постоянна, но ведь валюта может меняться
    //(Visa может быть и в белорусских рублях, и в евро)
    public static void transferMoney (BaseCard cardFrom, BaseCard cardTo, double transferSum){
        if (transferSum > cardFrom.getTransferLimit()){
            System.out.println("Unavailable operation");
        } else {
            double cardFromBalance = cardFrom.getAmount() - transferSum - (transferSum * cardFrom.getCommission());
            double cardToBalance = cardTo.getAmount() + transferSum;
            System.out.println(cardFromBalance + cardToBalance);
        }
    }
}
