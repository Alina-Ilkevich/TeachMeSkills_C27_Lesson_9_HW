package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.constant.CommissionConsts;
import com.teachmeskills.lesson9.task3.constant.CurrencyCodeConsts;
import com.teachmeskills.lesson9.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.task3.constant.LimitConsts;

public class MasterCard extends BaseCard {
    public MasterCard(long cardNumber, int CVV, double amount, int id) {
        super(cardNumber, CVV, amount, id);
    }
    public double getCommission() {
        return CommissionConsts.MASTER_CARD_COMMMISSION;
    }
    public int getCurrencyCode() {
        return CurrencyCodeConsts.USD_CURRENCY_CODE;
    }
    @Override
    public int getTransferLimit() {
        return LimitConsts.MASTER_CARD_LIMIT;
    }

}
