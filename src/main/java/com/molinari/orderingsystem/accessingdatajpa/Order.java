package com.molinari.orderingsystem.accessingdatajpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	private Long id;
	private Long stateId;
	@OneToMany
	@JoinColumn(name = "orderId")
	private Collection<OrderedProduct> products;
	
	protected Order() {
	}

	public Order(Long stateId, Collection<OrderedProduct> products) {
		this.stateId = stateId;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public Long getStateId() {
		return stateId;
	}

	public Collection<OrderedProduct> getOrderedProducts() {
		return products;
	}

	public void setProducts(Collection<OrderedProduct> products) {
		this.products = products;
	}
	
	
}
