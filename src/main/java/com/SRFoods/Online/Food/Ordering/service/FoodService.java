package com.SRFoods.Online.Food.Ordering.service;

import com.SRFoods.Online.Food.Ordering.model.Category;
import com.SRFoods.Online.Food.Ordering.model.Food;
import com.SRFoods.Online.Food.Ordering.model.Restaurant;
import com.SRFoods.Online.Food.Ordering.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {
    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;
    public List<Food> getRestaurantsFood(Long restaurantId,boolean isVegitarain,boolean isNonveg,boolean isSeasional,String foodCategory);
    public List<Food> searchFood(String Keyword);
    public Food findFoodById(Long foodId) throws Exception;
    public Food updateAvailabilityStatus(Long foodId) throws Exception;

}
