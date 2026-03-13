package com.klef.fsad.exam.service;

import java.util.List;

import com.klef.fsad.exam.model.Restaurant;

public interface RestaurantService {

    public String addRestaurant(Restaurant r);
    public List<Restaurant> viewAllRestaurants();

}
