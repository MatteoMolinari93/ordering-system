package com.molinari.orderingsystem.bl;

import com.molinari.orderingsystem.accessingdatajpa.Order;
import com.molinari.orderingsystem.accessingdatajpa.OrderedProduct;

public class OrderingManager {
	
	public static void order(Order order) {
		
		if(order == null || order.getOrderedProducts() == null || order.getOrderedProducts().size() < 1) {
			throw new RuntimeException("Order is empty");
		}
		
		for(OrderedProduct orderedProduct : order.getOrderedProducts()) {
			// check stocks
		}
		
	}
	

}
