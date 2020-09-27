package com.molinari.orderingsystem.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.molinari.orderingsystem.accessingdatajpa.Order;
import com.molinari.orderingsystem.accessingdatajpa.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepo;

	@Override
	public Order createOrder(Order order) {
		orderRepo.save(order);
		Order fetchedOrder = orderRepo.findById(order.getId()).orElseThrow();
		return fetchedOrder;
	}

	@Override
	public Collection<Order> getOrders() {
		return orderRepo.findAll();
	}

	@Override
	public Order getOrder(Long id) {
		return orderRepo.findById(id).orElseThrow();
	}

}
