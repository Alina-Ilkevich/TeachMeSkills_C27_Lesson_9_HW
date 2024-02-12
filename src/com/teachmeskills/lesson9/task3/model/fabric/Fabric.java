package com.teachmeskills.lesson9.task3.model.fabric;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.task3.model.card.impl.BelCard;
import com.teachmeskills.lesson9.task3.model.card.impl.MasterCard;
import com.teachmeskills.lesson9.task3.model.card.impl.VisaCard;

public class Fabric {
    public static BaseCard[] createCards(){
        BelCard belCard = new BelCard(123456, 456, 5200, 15);
        MasterCard masterCard = new MasterCard(785120, 120, 120, 78);
        VisaCard visaCard = new VisaCard(512490, 247, 840, 51);
        BaseCard[] cards = new BaseCard[]{belCard, masterCard,visaCard};
        return cards;
    }
}
