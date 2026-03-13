package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public String addRestaurant(Restaurant r) {
        restaurantRepository.save(r);
        return "Restaurant Added Successfully";
    }

    @Override
    public List<Restaurant> viewAllRestaurants() {
        return restaurantRepository.findAll();
    }
}
