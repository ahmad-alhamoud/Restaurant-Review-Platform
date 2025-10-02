package com.ahmad.restaurant.services;

import com.ahmad.restaurant.domain.GeoLocation;
import com.ahmad.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocation(Address address);
}
