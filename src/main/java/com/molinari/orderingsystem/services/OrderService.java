package com.molinari.orderingsystem.services;

import java.util.Collection;

import com.molinari.orderingsystem.accessingdatajpa.Order;

public interface OrderService {
	public abstract Order createOrder(Order order);
	public abstract Collection<Order> getOrders();
	public abstract Order getOrder(Long id);
}
