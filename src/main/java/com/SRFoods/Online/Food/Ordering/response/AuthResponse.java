package com.SRFoods.Online.Food.Ordering.response;

import com.SRFoods.Online.Food.Ordering.model.USER_ROLE;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import com.SRFoods.Online.Food.Ordering.model.User;
import com.SRFoods.Online.Food.Ordering.repository.UserRepository;
@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;

}
