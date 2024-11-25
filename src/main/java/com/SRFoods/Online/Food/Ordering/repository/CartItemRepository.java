package com.SRFoods.Online.Food.Ordering.repository;

import com.SRFoods.Online.Food.Ordering.model.Cart;
import com.SRFoods.Online.Food.Ordering.model.CartItem;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {


}
