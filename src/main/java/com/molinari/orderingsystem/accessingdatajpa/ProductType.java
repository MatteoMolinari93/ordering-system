package com.molinari.orderingsystem.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_types")
public class ProductType {
	
	@Id
	private Long id;
	private String name;
	
	protected ProductType() {
	}

	public ProductType(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
