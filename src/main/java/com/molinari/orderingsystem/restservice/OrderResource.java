package com.molinari.orderingsystem.restservice;

import org.springframework.web.bind.annotation.RestController;

import com.molinari.orderingsystem.accessingdatajpa.Order;
import com.molinari.orderingsystem.services.OrderService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class OrderResource {
	
	@Autowired
	private OrderService orderService;

	
	@GetMapping("/orders/{id}")
	public Order getProduct(@PathVariable(value = "id") final Long id) {
		return orderService.getOrder(id);
	}

	
	@GetMapping("/orders")
	public Collection<Order> getProducts() {
		return orderService.getOrders();
	}
	
	@PostMapping("/orders")
	public Order createProduct(@RequestBody final Order order) {
		return orderService.createOrder(order);
	}
}
