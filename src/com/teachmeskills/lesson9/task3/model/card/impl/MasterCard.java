package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.task3.constant.LimitConsts;

public class MasterCard extends BaseCard {
    public MasterCard(long cardNumber, int CVV, double amount, int id) {
        super(cardNumber, CVV, amount, id);
    }
    @Override
    public int getTransferLimit() {
        return LimitConsts.MASTER_CARD_LIMIT;
    }

}
