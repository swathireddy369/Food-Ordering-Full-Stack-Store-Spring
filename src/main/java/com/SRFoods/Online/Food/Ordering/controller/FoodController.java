package com.SRFoods.Online.Food.Ordering.controller;

import com.SRFoods.Online.Food.Ordering.model.Food;
import com.SRFoods.Online.Food.Ordering.model.Restaurant;
import com.SRFoods.Online.Food.Ordering.model.User;
import com.SRFoods.Online.Food.Ordering.request.CreateFoodRequest;
import com.SRFoods.Online.Food.Ordering.service.FoodService;
import com.SRFoods.Online.Food.Ordering.service.RestaurantService;
import com.SRFoods.Online.Food.Ordering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @Autowired
    private UserService userService;
    @Autowired
    private RestaurantService restaurantService;
    @GetMapping("/search")
    public ResponseEntity<List<Food>> searchFood(@RequestParam String name,
                                           @RequestHeader("Authorization") String jwt) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        List<Food> food=foodService.searchFood(name);

        return new ResponseEntity<>(food, HttpStatus.OK);

    }
    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<Food>> getRestaurantFood(@RequestParam boolean vegetarian,
                                                 @RequestParam boolean seasonal,
                                                 @RequestParam boolean nonveg,
                                                 @RequestParam(required = false) String food_category,
                                                 @PathVariable Long restaurantId,
                                                 @RequestHeader("Authorization") String jwt) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        List<Food> food=foodService.getRestaurantsFood(restaurantId,vegetarian,nonveg,seasonal,food_category);

        return new ResponseEntity<>(food, HttpStatus.OK);

    }

}
