package com.ibm.searchorder;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderSearchController {
	@Autowired
	OrderService orderService;

	@GetMapping("/order")
	List<Order> getOrders() {
		return orderService.getOrders();
	}
}

	/**
	 * method to search for an order
	 * 
	 * @param orderId
	 * @return zero or matching order
	 */

//	@GetMapping("/order/{id}")
//	Optional<Order> getOrder(@PathVariable("id") String orderId) {
//		return orderService.getOrder(orderId);
//	}