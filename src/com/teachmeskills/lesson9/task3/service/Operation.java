package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.constant.ConversionConsts;
import com.teachmeskills.lesson9.task3.constant.CurrencyCodeConsts;
import com.teachmeskills.lesson9.task3.model.card.BaseCard;

public class Operation {
    public static void transferMoney(BaseCard cardFrom, BaseCard cardTo, double transferSum) {
        if (transferSum > cardFrom.getTransferLimit()) {
            System.out.println("Unavailable operation");
        } else {
            if ((cardFrom.getCurrencyCode() == CurrencyCodeConsts.BYN_CURRENCY_CODE) &&
                    (cardTo.getCurrencyCode() == CurrencyCodeConsts.USD_CURRENCY_CODE)) {
                double cardFromBalance = cardFrom.getAmount() - transferSum - (transferSum * cardFrom.getCommission());
                double cardToBalance = cardTo.getAmount() + transferSum * ConversionConsts.BYN_TO_USD;
                System.out.println("The balance of the card from which the transfer was made: "
                        + cardFromBalance + "\nThe balance of the card to which the transfer was made: "
                        + cardToBalance);
            } else if ((cardFrom.getCurrencyCode() == CurrencyCodeConsts.USD_CURRENCY_CODE) &&
                    (cardTo.getCurrencyCode() == CurrencyCodeConsts.BYN_CURRENCY_CODE)) {
                double cardFromBalance = cardFrom.getAmount() - transferSum - (transferSum * cardFrom.getCommission());
                double cardToBalance = cardTo.getAmount() + transferSum * ConversionConsts.USD_TO_BYN;
                System.out.println("The balance of the card from which the transfer was made: "
                        + cardFromBalance + "\nThe balance of the card to which the transfer was made: "
                        + cardToBalance);
            } else {
                double cardFromBalance = cardFrom.getAmount() - transferSum - (transferSum * cardFrom.getCommission());
                double cardToBalance = cardTo.getAmount() + transferSum;
                System.out.println("The balance of the card from which the transfer was made: "
                        + cardFromBalance + "\nThe balance of the card to which the transfer was made: "
                        + cardToBalance);
            }
        }
    }
}
