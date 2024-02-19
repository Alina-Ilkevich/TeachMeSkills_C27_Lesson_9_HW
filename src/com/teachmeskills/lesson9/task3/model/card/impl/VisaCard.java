package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.constant.CommissionConsts;
import com.teachmeskills.lesson9.task3.constant.CurrencyCodeConsts;
import com.teachmeskills.lesson9.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.task3.constant.LimitConsts;

public class VisaCard extends BaseCard {
    public VisaCard(long cardNumber, int CVV, double amount, int id) {
        super(cardNumber, CVV, amount, id);
    }
    public double getCommission() {
        return CommissionConsts.VISA_CARD_COMMMISSION;
    }
    public int getCurrencyCode() {
        return CurrencyCodeConsts.USD_CURRENCY_CODE;
    }
    @Override
    public int getTransferLimit() {
        return LimitConsts.VISA_CARD_LIMIT;
    }
}
