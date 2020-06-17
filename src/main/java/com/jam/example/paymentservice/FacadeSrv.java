package com.jam.example.paymentservice;


import com.jam.example.paymentservice.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


//здесь методы которые дергаются из api папки. Класс объединяет другие низкоуровневые классы

@Service
public class FacadeSrv {

    private final CardService cardService;

    @Autowired
    public FacadeSrv(CardService cardService) {
        this.cardService = cardService;
    }

    //todo добавить в передаваемые параметры саму карту
    public UUID addCard(UUID userId) {
        return cardService.addCard(userId);
    }

    //todo добавить в передаваемые параметры саму карту
    public void delCard() {
        cardService.delCard();

    }


}
