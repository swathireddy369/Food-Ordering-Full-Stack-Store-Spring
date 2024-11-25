package com.SRFoods.Online.Food.Ordering.service;

import com.SRFoods.Online.Food.Ordering.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {

 public Category createCategory(String name,Long userId) throws Exception;

 public List<Category> findCategoryByRestaurantId(Long id)throws Exception;

 public Category findCategoryById(Long id )throws Exception;
}
