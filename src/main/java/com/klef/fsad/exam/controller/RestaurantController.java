package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.service.RestaurantService;


@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    // POST Operation
    @PostMapping("/add")
    public String addRestaurant(@RequestBody Restaurant r) {
        return restaurantService.addRestaurant(r);
    }

    // GET Operation
    @GetMapping("/viewall")
    public List<Restaurant> viewAllRestaurants() {
        return restaurantService.viewAllRestaurants();
    }
}
