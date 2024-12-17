package com.dailywork.dreamshops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailywork.dreamshops.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}