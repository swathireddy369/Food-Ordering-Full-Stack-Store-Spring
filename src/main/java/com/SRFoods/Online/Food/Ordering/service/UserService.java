package com.SRFoods.Online.Food.Ordering.service;


import com.SRFoods.Online.Food.Ordering.model.User;

public interface UserService {
 public User findUserByJwtToken(String jwt) throws Exception;
 public User findUserByEmail(String email) throws Exception;
}
