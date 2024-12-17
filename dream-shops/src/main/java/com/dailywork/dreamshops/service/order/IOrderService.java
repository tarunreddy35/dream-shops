package com.dailywork.dreamshops.service.order;

import java.util.List;

import com.dailywork.dreamshops.Dto.OrderDto;
import com.dailywork.dreamshops.model.Order;

public interface IOrderService {
	 Order placeOrder(Long userId);
	 OrderDto getOrder(Long orderId);
	 
	
	List<OrderDto> getUserOrders(Long userId);
	OrderDto convertToDto(Order order);
	

}
