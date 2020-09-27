package com.molinari.orderingsystem.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@IdClass(OrderedProductId.class)
@Table(name = "ordered_products")
public class OrderedProduct {
	
	@Id
	private Long orderId;
	@Id
	private Long productId;
	private Integer productCount;

	protected OrderedProduct() {
	}

	public OrderedProduct(Long orderId, Long productId, Integer productCount) {
		this.orderId = orderId;
		this.productId = productId;
		this.productCount = productCount;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public Long getOrderId() {
		return orderId;
	}

	public Long getProductId() {
		return productId;
	}

	
	
}
