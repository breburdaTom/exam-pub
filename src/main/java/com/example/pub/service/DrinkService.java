package com.example.pub.service;

import com.example.pub.model.Drink;
import com.example.pub.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {

    private final DrinkRepository drinkRepository;

    @Autowired
    public DrinkService(DrinkRepository drinkRepository) {

        this.drinkRepository = drinkRepository;
    }

    public List<Drink> getDrinks() {
        return drinkRepository.findAll();
    }

    public Drink getDrinkById(Long productId) {
        return drinkRepository.getById(productId);
    }

}
