package com.SRFoods.Online.Food.Ordering.service;

import com.SRFoods.Online.Food.Ordering.model.Cart;
import com.SRFoods.Online.Food.Ordering.model.CartItem;
import com.SRFoods.Online.Food.Ordering.request.AddCartItemReq;

public interface CartService {
    public CartItem addItemToCart(AddCartItemReq req, String jwt)throws Exception;
    public CartItem updateCartItemQuantity(Long cartItemId,int quantity)throws Exception;
    public Cart removeItemFromCart(Long cartItemId,String jwt)throws Exception;
    public Long calculateCartTotals(Cart cart) throws Exception;
    public Cart findCartById(Long id)throws Exception;
    public Cart findCartByUserId(Long userId)throws Exception;
    public Cart clearCart(Long UserId)throws Exception;

}
