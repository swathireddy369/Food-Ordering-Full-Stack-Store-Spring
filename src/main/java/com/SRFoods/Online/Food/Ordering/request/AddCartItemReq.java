package com.SRFoods.Online.Food.Ordering.request;

import lombok.Data;

import java.util.List;

@Data
public class AddCartItemReq {
    private Long foodId;
    private int quantity;
    private List<String> ingredients;


}
