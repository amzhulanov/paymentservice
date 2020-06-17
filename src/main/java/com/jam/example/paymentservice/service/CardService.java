package com.jam.example.paymentservice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

//сервисный класс для работы с entity
@Service
@Transactional
public class CardService {

    public UUID addCard(UUID userId) {
        return UUID.randomUUID();
    }

    public void delCard() {
        //todo удаляю карту из базы
    }

}
