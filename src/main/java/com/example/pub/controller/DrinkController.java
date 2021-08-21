package com.example.pub.controller;

import com.example.pub.model.Drink;
import com.example.pub.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DrinkController {

    private final DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }


    @GetMapping @RequestMapping(path = "drink-menu", method = RequestMethod.GET)
    public List<Drink> getDrinks() {
        return drinkService.getDrinks();
    }

    @GetMapping @RequestMapping(path = "drink/{id}", method = RequestMethod.GET)
    public Drink getDrinkDetails(@PathVariable long id) {
        return drinkService.getDrinkById(id);
    }

}
