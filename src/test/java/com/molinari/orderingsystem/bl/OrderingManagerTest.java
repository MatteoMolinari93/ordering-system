package com.molinari.orderingsystem.bl;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.molinari.orderingsystem.accessingdatajpa.Order;
import com.molinari.orderingsystem.accessingdatajpa.OrderedProduct;

class OrderingManagerTest {

	@Test()
	void orderNotEmpty() {
		Assertions.assertThrows(Exception.class, () -> {
			OrderingManager.order(null);
		});
		Assertions.assertThrows(Exception.class, () -> {
			OrderingManager.order(new Order(1L, null));
		});
		Assertions.assertThrows(Exception.class, () -> {
			OrderingManager.order(new Order(1L, new ArrayList()));
		});
	}
	
	@Test
	void productToBeOrderedHasStock() {
		ArrayList<OrderedProduct> products = new ArrayList<OrderedProduct>();
		products.add(new OrderedProduct(1L, 1L, 0));
		
		Assertions.assertThrows(Exception.class, () -> {
			OrderingManager.order(new Order(1L, products));
		});
	}
	
	@Test
	void productStockUpdatedAfterOrderDelivered() {
		fail("Not yet implemented");
	}

}
