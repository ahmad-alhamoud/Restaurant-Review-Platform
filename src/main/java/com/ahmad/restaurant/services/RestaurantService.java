package com.ahmad.restaurant.services;

import com.ahmad.restaurant.domain.RestaurantCreateUpdateRequest;
import com.ahmad.restaurant.domain.entities.Restaurant;

public interface RestaurantService {
    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);
}
