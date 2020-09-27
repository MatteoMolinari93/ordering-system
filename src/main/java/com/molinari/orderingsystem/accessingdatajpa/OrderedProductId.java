package com.molinari.orderingsystem.accessingdatajpa;

import java.io.Serializable;

public class OrderedProductId implements Serializable {
	private static final long serialVersionUID = -2934159290600773521L;
	
	private Long orderId;
	private Long productId;
	
	
	public OrderedProductId() {
	}

	public OrderedProductId(Long orderId, Long productId) {
		this.orderId = orderId;
		this.productId = productId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public Long getProductId() {
		return productId;
	}
	
}