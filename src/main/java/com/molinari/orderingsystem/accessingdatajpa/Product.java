package com.molinari.orderingsystem.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long typeId;
	private String name;
	private String description;
	private Long stock;

	protected Product() {
	}


	public Product(Long typeId, String name, String description, Long stock) {
		this.typeId = typeId;
		this.name = name;
		this.description = description;
		this.stock = stock;
	}



	public Long getId() {
		return id;
	}

	public Long getTypeId() {
		return typeId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Long getStock() {
		return stock;
	}
	
	public void stock() {
		this.stock += 1;
	}
	
}
