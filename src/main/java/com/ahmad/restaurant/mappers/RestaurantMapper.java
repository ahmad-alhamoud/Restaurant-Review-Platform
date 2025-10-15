package com.ahmad.restaurant.mappers;

import com.ahmad.restaurant.domain.RestaurantCreateUpdateRequest;
import com.ahmad.restaurant.domain.dtos.GeoPointDto;
import com.ahmad.restaurant.domain.dtos.RestaurantCreateUpdateRequestDto;
import com.ahmad.restaurant.domain.dtos.RestaurantDto;
import com.ahmad.restaurant.domain.entities.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface RestaurantMapper {

    RestaurantCreateUpdateRequest toRestaurantCreateUpdateRequest(RestaurantCreateUpdateRequestDto dto);

    RestaurantDto toRestaurantDto(Restaurant restaurant);

    @Mapping(target = "latitude", expression = "java(geoPoint.getLat())")
    @Mapping(target = "longitude", expression = "java(geoPoint.getLon())")
    GeoPointDto toGeoPointDto(GeoPoint geoPoint);

}
