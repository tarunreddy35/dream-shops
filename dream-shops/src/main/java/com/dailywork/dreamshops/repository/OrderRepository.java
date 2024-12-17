package com.dailywork.dreamshops.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailywork.dreamshops.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

	List<Order> findByUserId(Long userId);

}
