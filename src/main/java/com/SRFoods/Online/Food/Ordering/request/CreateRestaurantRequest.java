package com.SRFoods.Online.Food.Ordering.request;

import com.SRFoods.Online.Food.Ordering.model.Address;
import com.SRFoods.Online.Food.Ordering.model.ContactInformation;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {
    private Long id;
    private String name;
    private String description;
    private String cuisineType;
    private Address address;
    private ContactInformation contactInformation;
    private String openingHours;
    private List<String> images;


}
