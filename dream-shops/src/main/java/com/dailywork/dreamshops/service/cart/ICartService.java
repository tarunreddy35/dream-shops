package com.dailywork.dreamshops.service.cart;

import java.math.BigDecimal;

import com.dailywork.dreamshops.model.Cart;


public interface ICartService {
	
	 Cart getCart(Long id);
	    void clearCart(Long id);
	    BigDecimal getTotalPrice(Long id);

	    
	    Cart getCartByUserId(Long userId);
		
		
		Long initializeNewCart();
}
