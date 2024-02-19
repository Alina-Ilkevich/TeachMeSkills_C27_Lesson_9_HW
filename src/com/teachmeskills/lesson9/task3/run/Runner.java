package com.teachmeskills.lesson9.task3.run;

import com.teachmeskills.lesson9.task3.model.card.impl.BelCard;
import com.teachmeskills.lesson9.task3.model.card.impl.VisaCard;
import com.teachmeskills.lesson9.task3.service.Operation;

public class Runner {
    public static void main(String[] args) {
        BelCard cardFrom = new BelCard(123456, 456, 5200, 15);
        VisaCard cardTo = new VisaCard(456789, 123, 1400, 24);
        Operation.transferMoney(cardFrom, cardTo, 140);
    }
}
