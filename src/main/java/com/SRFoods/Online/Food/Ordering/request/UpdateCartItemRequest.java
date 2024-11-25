package com.SRFoods.Online.Food.Ordering.request;

import lombok.Data;

@Data
public class UpdateCartItemRequest {
    private Long CartItemId;
    private int quantity;
}
